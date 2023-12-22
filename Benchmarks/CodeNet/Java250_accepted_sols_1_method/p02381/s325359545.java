import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			double[] s = new double[n];
			double sum = 0;
			for(int i=0; i<n; i++){
				s[i] = sc.nextDouble();
				sum += s[i];
			}
			
			double ave = sum / n;
			double psum = 0;
			for(int i=0; i<n; i++){
				psum += Math.pow(s[i] - ave, 2);
			}
			
			double std = Math.sqrt(psum / n);
			System.out.println(std);
			
		}
	}

}