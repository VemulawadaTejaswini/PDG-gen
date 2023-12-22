import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int direction = 0;
        int last = a[0];
        int ans = 1;

        for (int val: a) {
            if (direction == 0) {
                if (val > last) direction = 1;
                if (val < last) direction = -1;
                last = val;
            }
            if (direction == 1) {
                if (val < last) {
                    direction = 0;
                    ans += 1;
                } last = val;
            }
            if (direction == -1) {
                if (val > last) {
                    direction = 0;
                    ans += 1;
                } last = val;
            }
        }
        System.out.println(ans);
    }
}
