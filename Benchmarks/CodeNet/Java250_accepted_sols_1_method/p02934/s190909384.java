import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        double bunshi = 1;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextDouble();
            bunshi *= a[i];
        }
        double bunbo = 0;
        for (int i=0; i<n; i++) {
            bunbo += bunshi / a[i];
        }
        System.out.print(bunshi / bunbo);
    }
}