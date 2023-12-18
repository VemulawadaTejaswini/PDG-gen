import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n != 0) { 
			int[] num = new int[n];
			double average = 0;
			double dispersion = 0;
			double A;
			for (int i = 0; i < n; i++) {
				num[i] = scan.nextInt();
				average += num[i];
			}
			average = average / n;
			for (int i = 0; i < n; i++) {
				dispersion += Math.pow((num[i] - average), 2);
			}
			A = Math.sqrt(dispersion / n);
			System.out.println(A);
			n = scan.nextInt();
		}
	}

}