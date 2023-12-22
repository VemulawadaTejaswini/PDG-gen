import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		int x[] = new int[n];
		for(int i = 0; i < n; ++i){
			x[i] = sc.nextInt();
			sum += x[i];
		}
		int min = sum / n;
		double ave = (double) sum / (double) n;
		min = (Math.abs(ave - (double)min) <= Math.abs(ave - (double)(min + 1)) ? min : min + 1);
		int ans = 0;
		for(int i = 0; i < n; ++i){
			ans += (x[i] - min) * (x[i] - min);
		}
		sc.close();
		System.out.println(ans);
	}
}
