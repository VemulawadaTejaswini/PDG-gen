import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }

        int l = 0, r = n - 1;
        int s1 = 0, s2 = 0;
        while (l <= r) {
            if (s1 <= s2) {
                s1 += w[l++];
            } else {
                s2 += w[r--];
            }
        }

        System.out.println(Math.abs(s1 - s2));
    }
}
