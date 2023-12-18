
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		while (true) {
			int n = s.nextInt();
			if(n == 0) {
				break;
			}
			int[] sk = new int[n];
			for (int i = 0; i < n; i++) {
				sk[i] = s.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += sk[i];
			}
			double ave = (double) sum / (double) n;
			double sig = 0;
			for (int i = 0; i < n; i++) {
				sig += (sk[i] - ave) * (sk[i] - ave);
			}
			double ans = Math.sqrt(sig / n);
			System.out.printf("%.8f\n",ans);
		}
	}
		
}