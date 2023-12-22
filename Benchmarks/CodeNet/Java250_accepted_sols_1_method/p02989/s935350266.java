import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < a; i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer> list1 = new ArrayList<>(list);
        Collections.sort(list1);
        int center1 = list1.size() / 2 - 1;
        int center2 = center1 + 1;
        int ans = list1.get(center2) - list1.get(center1);
        
        System.out.println(ans);
    }
}