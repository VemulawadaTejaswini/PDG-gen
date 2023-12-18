import java.util.*;
import java.io.*;
import java.lang.*;

public class ABC169B {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] arr = new long[t];
		long product = 1; long upperLimit = 1000000000000000000l;
		while(t-- > 0) {
			arr[t] = sc.nextLong();
			product*=arr[t];
			if (arr[t] == 0) {
				break;
			} 
		}
		System.out.println(product < upperLimit ? product : "-1" );
	}
}
