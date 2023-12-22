import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if(x == 0) {
            System.out.println(x);
            return;
        }
        int min = Integer.MAX_VALUE;
        int ans1 = 0;
        for (int i = -101; i <= 101; i++) {
            if(!list.contains(i)) {
                if(min > Math.abs(i - x)) {
                    min = Math.abs(i - x);
                    ans1 = i;
                }
            }
        }
        int ans2 = 0;
        min = Integer.MAX_VALUE;
        for (int i = 101; i >= -101; i--) {
            if(!list.contains(i)) {
                if(min > Math.abs(i - x)) {
                    min = Math.abs(i - x);
                    ans2 = i;
                }
            }
        }
        System.out.println(Math.min(ans1, ans2));
    }
}