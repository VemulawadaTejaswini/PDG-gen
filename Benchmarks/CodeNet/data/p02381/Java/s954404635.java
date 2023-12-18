import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();

			if(n == 0) {
				break;
			}
			else {
				int []s = new int[n];
				double sum = 0;

				for(int i = 0; i < n; i++) {
					s[i] = sc.nextInt();
					sum += s[i];
				}
				
				double m = sum / n;
				double sumx = 0;

				for(int j = 0; j < n; j++) {
					sumx += Math.pow(s[j] - m, 2);
				}
				
				System.out.println(Math.sqrt(sumx / n));
			}
		}
		sc.close();
	}
}
