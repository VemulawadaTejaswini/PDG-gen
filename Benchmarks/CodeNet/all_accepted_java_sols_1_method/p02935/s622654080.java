import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	double[] v = new double[n];
	for (int i=0; i<n; i++) v[i] = sc.nextDouble();
	Arrays.sort(v);
	double newIs = (v[0] + v[1]) / 2;
	for (int i=2; i<n; i++) {
	    newIs = (newIs + v[i]) / 2;
	}
	System.out.print(newIs);
    }
}
