import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i = 0;
		int[] a = new int[m];
		int[] b = new int[m];
		for(i = 0; i < m; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();	
		}
		for(i = 0; i < n; i++) {
			int c = 0;
			for(int j = 0; j < m; j++) {
				if(i + 1 == a[j] || i + 1 == b[j]) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}