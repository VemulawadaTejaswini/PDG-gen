import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int r = scan.nextInt();
			
			if(n==0&&r==0)break;
			
			int p, c;
			int[] Y = new int[50];
			int[] pp = new int[50];
			int[] cc = new int[50];

			for (int i = 0; i < n; i++) {
				Y[i] = n - i;
			}

			for (int i = 0; i < r; i++) {
				p = scan.nextInt();
				c = scan.nextInt();
				for (int j = 0; j < (p - 1); j++) {
					pp[j] = Y[j];
				}
				for (int j = 0; j < c; j++) {
						cc[j] = Y[j+p-1];
				}
				for (int j = 0; j < c; j++) {
					Y[j] = cc[j];
				}
				for (int j = 0; j < p-1; j++) {
						Y[j+c] = pp[j];
				}
			}
			System.out.println(Y[0]);
		}
	}
}