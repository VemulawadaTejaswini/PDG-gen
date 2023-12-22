import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(sc.next());
        }

        int[] s = new int[n + 1];
        s[0] = 0;
        int sum = 0;
        for (int i = 1; i < s.length; i++) {
            s[i] = s[i - 1] + w[i - 1];
        }

        int result = 1000000;
        for (int t = 1; t < n; t++) {
            result = Math.min(result, Math.abs(s[t] - (s[n] - s[t])));
        }

        System.out.println(result);
    }
}
