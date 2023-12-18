import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // 人々の座標
        int n;
        n = sc.nextInt();
        ArrayList<Integer> persons = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            persons.add(sc.nextInt());
        }
 
        int target = 0;
        // 点Pの算出
        int min = 100;
        int max = 0;
 
        // min
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i) <= min) {
                min = persons.get(i);
            }
        }
 
        // max
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i) >= max) {
                max = persons.get(i);
            }
        }
 
        int targetMin = 0;
        // 点Pと各座標の算出
        for (int tenP = min; tenP < max; tenP++) {
        	target =0;
            for (int i = 0; i < persons.size(); i++) {
                target = target + (persons.get(i) - tenP) * (persons.get(i) - tenP);
            }
            if(tenP == min) {
              targetMin = target;
            }else if(targetMin > target) {
            	targetMin = target;
            }
        }
 
        System.out.println(targetMin);
    }
}