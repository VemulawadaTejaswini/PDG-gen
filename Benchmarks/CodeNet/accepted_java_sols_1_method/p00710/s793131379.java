import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                int r = sc.nextInt();
                if (n==0&&r==0) break;
                int p[] = new int[r];
                int c[] = new int[r];
                for (int i = 0; i < r; i++) {
                    p[i] = sc.nextInt();
                    c[i] = sc.nextInt();
                }
                int num[] = new int[n];
                for (int i = 0; i < n; i++) {
                    num[i] = n - i;
                }
                for (int i = 0; i < r; i++) {
                    int tmp[] = new int[n];
                    for (int j = 0; j < c[i]; j++) {
                        tmp[j] = num[p[i]+j-1];
                    }
                    for (int k = 0; k < p[i]-1; k++) {
                        tmp[c[i] + k] = num[k];
                    }
                    for (int l = 0; l < p[i]+c[i]-1; l++) {
                        num[l] = tmp[l];
                    }
                }
                System.out.println(num[0]);
            }
        }
    }
}
