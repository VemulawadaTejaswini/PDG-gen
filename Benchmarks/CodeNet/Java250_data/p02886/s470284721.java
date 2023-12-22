import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d[] = new int[n];

		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			d[i] = scan.nextInt();;
		}
		for(int i = 0; i < n -1; i++) {
			for(int j = i + 1; j < n; j++) {
				ans +=  d[i] * d[j];
			}
		}
		System.out.println(ans);
	}
}