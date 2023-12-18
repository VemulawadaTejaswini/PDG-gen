import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] mon = new double [n];
		String [] cur = new String [n];
		
		for (int i=0; i<n; i++) {
			mon[i] = sc.nextDouble();
			cur[i] = sc.next();
		}
		
		for (int i=0; i<n; i++) {
			if (cur[i].equals("BTC")) {
				mon[i] *= 380000;
			}
		}
		
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			sum+=mon[i];
		}
		
		System.out.println(sum);
		
	}

}
