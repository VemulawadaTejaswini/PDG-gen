import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        int[] w = new int[n], e = new int[n];
        w[0] = s.charAt(0) == 'W' ? 1 : 0;
        for(int i = 1; i < n; i++) {
            w[i] = w[i - 1] + (s.charAt(i) == 'W' ? 1 : 0);
        }
        e[n - 1] = s.charAt(n - 1) == 'E' ? 1 : 0;
        for(int i = n - 2; i >= 0; i--) {
            e[i] = e[i + 1] + (s.charAt(i) == 'E' ? 1 : 0);
        }
        int ans = Math.min(w[n - 1], e[0]);
        for(int i = 1 ; i < n - 1; i++) {
            ans = Math.min(ans, w[i - 1] + e[i + 1]);
        }
        System.out.println(ans);
    }
}