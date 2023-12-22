import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        double ans = 0;
        Arrays.sort(v);
        for (int i = 0; i < n-1; i++) {
            ans = (v[i] + v[i+1]) / 2;
            v[i+1] = ans;
        }

        System.out.println(ans);
        sc.close();
    }
}