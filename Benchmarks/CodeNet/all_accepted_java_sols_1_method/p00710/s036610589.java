import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if (n == 0 && r == 0) break;
            int[] N = new int[n];
            for (int i = 0; i < n; i++) {
                N[i] = n - i;
            }
            for (int i = 0; i < r; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] tmp = new int[n];
                for (int j = p - 1; j < p - 1 + c; j++) {
                    tmp[j-p+1] = N[j];
                }
                for (int j = 0; j < p - 1; j++) {
                    tmp[c + j] = N[j];
                }
                for (int j = p + c - 1; j < n; j++) {
                    tmp[j] = N[j];
                }
                N = tmp;
            }
            System.out.println(N[0]);
        }
        sc.close();
    }
}
