import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			int n = sc.nextInt();
			int x[] = new int[n];
			int y[] = new int[n];
			
			for(int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				y[i] = sc.nextInt();
			}
			
			double pOneSigma = 0;
			double pTwoSigma = 0;
			double pThreeSigma = 0;
			double max = 0;
			
			for(int i = 0; i < n; i++) {
				double abs = Math.abs(x[i] - y[i]);
				pOneSigma += abs;
				pTwoSigma += Math.pow(abs, 2);
				pThreeSigma += Math.pow(abs, 3);
				
				if(max < abs) {
					max = abs;
				}
			}
			
			System.out.format("%.6f\n", pOneSigma);
			System.out.format("%.6f\n", Math.sqrt(pTwoSigma));
			System.out.format("%.6f\n", Math.cbrt(pThreeSigma));
			System.out.format("%.6f\n", max);
		}
	}
}
