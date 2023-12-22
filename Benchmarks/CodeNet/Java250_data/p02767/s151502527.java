import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] x = new int[n];
	    int sq = 0;
	    int sum = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            sq += x[i] * x[i];
            sum += x[i];
        }
	    int p = sum / n;
        int p1 = p + 1;

        int r1 = (n * p - 2 * sum) * p;
        int r2 = (n * p1 - 2 * sum) * p1;
        int r = sq + Integer.min(r1, r2);
        System.out.println(r);
    }
}
