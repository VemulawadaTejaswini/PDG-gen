import java.util.*;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] x = new double[N];
        double[] y = new double[N];
        for (int i=0; i<N; i++) {
        		x[i] = sc.nextDouble();
        		y[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i=0; i<N-1; i++) {
        		for (int j=i+1; j<N; j++) {
        			sum += Math.sqrt(Math.pow((x[i]-x[j]), 2)+Math.pow((y[i]-y[j]), 2));
        		}
        }
        int n = N*(N-1)/2;
         System.out.println(sum*(N-1)/n);
    }
}