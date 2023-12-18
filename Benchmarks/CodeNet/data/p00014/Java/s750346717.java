import java.util.*;
public class Main {
	public static int[] val;
	public static int n;
	public static int x;
	public static boolean[] dp;
	public static int[] PrimeTable;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			int d = stdIn.nextInt();
			int ans = sorv(d,d);
		
			System.out.println(ans);
		}
	}
	public static int sorv(int d, int s) {
		if(s == 600) {
			return 0;
		}
		int tmp = d*d * s;
		if(600 - s >= d + s) {
			return tmp + sorv(d + s, s);
		}
		return tmp;
	}

	
}