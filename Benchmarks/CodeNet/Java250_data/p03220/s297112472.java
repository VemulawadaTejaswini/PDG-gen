import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();

        double[] h = new double[n];
        for(int i = 0; i < n; i++) {
        	h[i] = Math.abs(a - (t - scan.nextDouble() * 6 / 1000));
        }

        int ans = 0;
        double temp = Double.MAX_VALUE;
        for(int i = 0; i < n; i++) {
        	if(temp > h[i]) {
        		temp = h[i];
        		ans = i + 1;
        	}
        }

        System.out.println(ans);
    }
}
