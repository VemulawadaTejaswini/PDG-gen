import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		//f(n)のnを取得 1<=n<=10^4
		int n = Integer.parseInt(sc.next());
		int[] result = culc(n);
		for(int res : result) {
			System.out.println(res);
		}
	
	}
	
	private static int[] culc(int n) {
		int[] result = new int[n];
		for (int x=1; x<n; x++) {
			for (int y=1; y<n; y++) {
				for (int z=1; z<n; z++) {
					int ans =x*x + y*y + z*z + x*y + y*z + z*x;
					if (ans<=n) {
						result[ans-1]++;
					} else {
						break;
					}
				}
			}
		}
		return result;
	}
		
}
