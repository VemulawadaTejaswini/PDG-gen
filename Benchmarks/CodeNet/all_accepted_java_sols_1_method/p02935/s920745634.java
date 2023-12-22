import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] f = new double[N];
		for (int i = 0; i < f.length; i++)
			f[i] = sc.nextDouble();
		Arrays.sort(f);
		double[] nf = new double[N - 1];
		nf[0] = (f[0] + f[1]) / 2;
		for (int i = 2; i < f.length; i++) {
			nf[i - 1] = (nf[i - 2] + f[i]) / 2;
		}
		System.out.println(String.format("%.5f", nf[nf.length - 1]));
		sc.close();
	}
}