
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		boolean []b = new boolean [200];
		
		for(int i = 0 ; i < n  ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		Arrays.fill(b, false);
		
		int min = 1000000000;
		int ans = k;
		for(int i = 0 ; i < n  ;i++) {
			b[a[i]] = true;
		}
		
		for(int i = 0 ; i < 200 ;i++) {
			if(min > Math.abs(i-k) && !b[i]) {
				min = Math.abs(i-k);
				ans = i;
			}
		}
		
		System.out.println(ans);

	}
}
