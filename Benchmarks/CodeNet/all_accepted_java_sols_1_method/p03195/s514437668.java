import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[]a = new long[n];

		for(int i=0;i<n;i++) {
			a[i]=Long.parseLong(sc.next());
		}
		sc.close();
		if(n == 1) {
			if(a[0]%2==1) {
				System.out.println("first");
				return;
			}
		}

		String res = "second";
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
	        if (a[i] % 2 == 1) {
	        	res = "first";
	        	break;
	        }
	     }
	    System.out.println(res);
	}

}
