import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] s = new int[n];
        Arrays.fill(s, 1);

        for (int i = 0; i < k; i++) {
            int d = scn.nextInt();
            for (int a = 0; a < d; a++) {
                int A = scn.nextInt();
                s[(A - 1)] = 0;
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans = ans + s[i];
        }

        System.out.println(ans);


        scn.close();
    }
}