import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        sc.close();

        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            int s1 = 0;
            int s2 = 0;
            for (int k = 0; k < i; k++) {
                s1 += w[k];
            }
            for (int j = i; j < n; j++) {
                s2 += w[j];
            }
            ans = Math.min(ans, Math.abs(s1 - s2));
        }

        System.out.println(ans);

    }
}