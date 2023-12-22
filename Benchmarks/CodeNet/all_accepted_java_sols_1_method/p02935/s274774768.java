import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i< n; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        double tmp = v[0];
        for (int i = 1;i < n;i++) {
            double val = (v[i] + tmp) / 2;
            tmp = val;
        }
        System.out.println(tmp);
    }
}