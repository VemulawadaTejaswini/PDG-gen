




import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		double p = 0;
		
		for (int i=1;i<=n;i++) {
			
			double tmp = 1.0/n;
			for (int j=i;j<k;j*=2) {
				tmp/=2;
			}
			
			p+=tmp;
		}
		System.out.println(p);



	}




}
