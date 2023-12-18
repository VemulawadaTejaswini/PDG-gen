import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		//f(n)のnを取得 1<=n<=10^4
		int n = Integer.parseInt(sc.next());
		for(int i = 1; i<=n; i++) {
			int result = culc(i);
			System.out.println(result);
		}
	}
	
	private static int culc(int n) {
		int result = 0;
		for (int x=1; x<n; x++) {
			for (int y=1; y<n; y++) {
				for (int z=1; z<n; z++) {
					int ans =x*x + y*y + z*z + x*y + y*z + z*x;
					if (ans==n) {
						result++;
					}
				}
			}
		}
		return result;
	}
		
}
