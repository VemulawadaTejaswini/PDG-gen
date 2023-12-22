import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		Integer a[] = new Integer[N];
		
		for(int i = 0; i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		
		//int alice = 0;
		//int bob = 0;
		int ans = 0;
		Arrays.sort(a, Collections.reverseOrder());
		for(int i = 2; i<a.length+2; i++) {
			if((i % 2 == 0)) { 
				ans += a[i-2];
			} else {
				ans = ans + ((-1) * a[i-2]);
			}
		}
		System.out.println(ans);

	}

}
