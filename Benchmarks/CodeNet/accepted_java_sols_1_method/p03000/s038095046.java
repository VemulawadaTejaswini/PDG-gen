import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> ins = new ArrayList<>();
        for(int i = 0;i < n;i++){
            ins.add(sc.nextInt());
        }
        int prev = 0;
        int r = 0;
        for(int i = 1;i < n + 1;i++){
            if(prev + ins.get(i - 1) <= x){
                r++;
            }
            prev = prev + ins.get(i - 1);
        }
        System.out.println(++r);
    }
}