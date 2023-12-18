import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int alice = 0;
		int bob = 0;
		int n = stdIn.nextInt();
		Integer [] a = new Integer[n];
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				alice+= a[i];
			}else {
				bob += a[i];
			}
		}
		System.out.println(alice - bob);
	}

}
