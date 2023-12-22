import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = 999999;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(a[i], min);
        }

        int breakPoint = 0;
        if (min > 1) {
            System.out.println(-1);
        } else {
            int tmp = min;
            for (int i = 0; i < n; i++) {
                if (a[i] != tmp) {
                    breakPoint++;
                    continue;
                }

                tmp++;
            }
            System.out.println(breakPoint);
        }
    }
}
