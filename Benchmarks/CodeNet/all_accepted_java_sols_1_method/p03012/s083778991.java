import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            total += w[i];
        }

        int s1 = 0;
        int s2;
        int ans = total;
        for (int i = 0; i < n; i++) {
            s1 += w[i];
            s2 = total - s1;
            int candidate = Math.abs(s1 - s2);
            if (candidate < ans) {
                ans = candidate;
            }
        }
        System.out.println(ans);

        sc.close();

    }

}
