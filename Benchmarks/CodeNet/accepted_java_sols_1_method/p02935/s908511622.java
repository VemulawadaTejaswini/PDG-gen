import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] m = new int[n];
		for(int i = 0 ; i<n ;i++) {
			m[i] = scn.nextInt();
		}
		Arrays.sort(m);
		double ans = m[0];
		for(int i = 1 ; i<n ;i++) {
			ans = (ans + m[i])/2;
		}
		System.out.println(ans);
		scn.close();
	}
}