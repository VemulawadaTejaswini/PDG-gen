import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] s = new int[n];
		for(int i = 0; i < n; i++) {
			s[i] = stdIn.nextInt();
		}
		int q = stdIn.nextInt();
		int[] t = new int[q];
		for(int i = 0; i < q; i++) {
			t[i] = stdIn.nextInt();
		}
		Arrays.sort(s);
		Arrays.sort(t);
		int ansp = 0;
		if(n < q) {
			for(int i = 0; i < n; i++) {
				if(Arrays.binarySearch(t, s[i]) >= 0) {
					ansp++;
				}
			}
		}
		else {
			ansp = 0;
			for(int i = 0; i < q; i++) {
				if(Arrays.binarySearch(s, t[i]) >= 0) {
					ansp++;
				}
			}
		}
		System.out.println(ansp);
	}

}