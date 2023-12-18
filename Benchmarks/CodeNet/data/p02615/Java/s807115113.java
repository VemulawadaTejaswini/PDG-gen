import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		Integer[] a = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		long cnt = 0;
		
		Arrays.sort(a,Collections.reverseOrder());
		

		
		for(int i = 1; i < n; i++) {
			cnt += a[i-1];
		}
		
		System.out.println(cnt);
	}

}
