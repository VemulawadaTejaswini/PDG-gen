import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a0 = sc.nextInt();
		int t = a0;
		int g = 0;
		for ( int i=1; i<n; i++ ) {
			int a = sc.nextInt();
			if ( t > a ) {
				g += t-a;
			} else {
				t = a ;
			}
		}

		System.out.println(g);
	}
}