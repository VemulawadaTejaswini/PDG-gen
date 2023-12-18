import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while (true){
			int n = scan.nextInt();
			if (n == 0){
				break;
			}
			
			int [] s = new int [n];
			double m = 0;
			double v = 0;
			
			for (int i = 0; i < n; i++){
				s[i] = scan.nextInt();
				m += s[i];
			}
			m /= n;
			
			for (int i = 0; i < n; i++){
				v += (s[i] - m) * (s[i] - m) / n;
			}
			System.out.printf("%f\n", Math.sqrt(v));
		}
	}
}