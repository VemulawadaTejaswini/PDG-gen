import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] r = new int[200000];
		
		int n = stdIn.nextInt();
		
		for (int i = 0; i < n; i++)
			r[i] = stdIn.nextInt();
		
		int ans = calcMaxDifference(r, n);
		System.out.println(ans);
	}
	
	public static int calcMaxDifference(int[] r, int n) {
		int max = r[1] - r[0];
		int rmin = r[0];
		
		for (int i = 1; i < n; i++) {
			max = (max > r[i] - rmin ? max : r[i] - rmin);
			rmin = (rmin < r[i] ? rmin : r[i]);
		}
		return max;
	}
}