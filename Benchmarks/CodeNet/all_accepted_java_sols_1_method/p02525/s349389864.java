import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		while (true){
			int n = input.nextInt();
			if (n == 0)break;
			double sigma = 0;
			double[] s = new double[n + 1];
			
			double sum = 0;
			for (int i = 0; i < n; i++){
				s[i] = input.nextDouble();
				sum += s[i];
			}
			
			double m = sum / n;
			
			for (int i = 0; i < n; i++){
				sigma += Math.pow(s[i] - m, 2);
			}
			
			double a = Math.sqrt(sigma / n);
			
			System.out.println(a);
		}
	}
}