import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 100; i++) {
            int t = 0;
            for (int j = 0; j < n; j++) {
                t += (x[j] - i)*(x[j] - i);
            }
            if(t < ans) ans = t;
        }
        System.out.println(ans);
        sc.close();

    }

}
