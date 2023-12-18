
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String qwright = "nmhjklyuiop" ;
			
			while(true) {
				int n = sc.nextInt();
				if(n == 0)	break;
				int[] a = new int[n];
				for(int i=0; i<n; i++) {
					a[i] = sc.nextInt();
				}
				Arrays.sort(a);
				int min = 1000000;
				for(int i=0; i<n-1; i++) {
					int sa = Math.abs(a[i] - a[i+1]);
					if(sa < min)	min = sa;
				}
				System.out.println(min);
			}
			
			
			
			
			
		}
	}
}


