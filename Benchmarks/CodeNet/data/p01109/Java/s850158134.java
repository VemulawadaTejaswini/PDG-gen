import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] a = new int[n];
            int sumA = 0;
            int ave = 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sumA += a[i];
            }
            ave = sumA/n;
            for (int i = 0; i < n; i++) {
                if(a[i]<=ave) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
