import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        double[] e = new double[n];
        for(int i=0; i<n; i++) {
            int p = in.nextInt();
            e[i] = p * (p+1) / 2.0 / (double)p;
        }
        double max = 0;
        for(int i=0; i<k; i++) {
            max += e[i];
        }
        double cur = max;
        for(int i=0; i<n-k; i++) {
            cur -= e[i];
            cur += e[i+k];
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}
