import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			
			double st = 0;
			double m = 0;
			double to = 0;
			double a = 0;
			double[] s = new double[n];
			for(int i=0; i<n; i++){
				s[i] = sc.nextDouble();
				st += s[i];
			}
			m = st/n;
			for(int i=0; i<n; i++){
				to += Math.pow(s[i]-m, 2);
			}
			a = Math.sqrt(to/n);
			System.out.println(a);
		}
	}
}