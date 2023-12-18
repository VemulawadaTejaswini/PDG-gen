import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;

			int[] s = new int[n];
			int sum = 0;
			for(int i=0; i<n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			double m = (double) sum / n;
			double a2 = 0;
			for(int i=0; i<n; i++) {
				a2 += (s[i] - m) * (s[i] - m);
			}
			a2 /= n;
			double a = Math.sqrt(a2);
			System.out.println(a);
		}
		sc.close();
	}
}