import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            boolean s = true;
            for (int j = 0; j < S.length; j++) {
                if (S[j] == t) {
                    s = false;
                    break;
                }
            }
            if (s == true) {
                S[i] = t;
            }
        }
        int q = sc.nextInt();
        int C = 0;
        int[] T = new int[q];
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            boolean s = true;
            for (int j = 0; j < T.length; j++) {
                if (T[j] == t) {
                    s = false;
                    break;
                }
            }
            if (s == true) {
                T[i] = t;
            }
        }
        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if (S[i] == T[j]) {
                    C++;
                }
            }
        }
        System.out.println(C);
    }
}