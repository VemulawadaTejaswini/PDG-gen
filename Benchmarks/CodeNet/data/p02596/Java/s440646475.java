import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		if ( k%2==0 || k%5==0 ) {
			System.out.println("-1");
			System.exit(0);
		}

		int[] r = new int[1000000];
		Arrays.fill(r, -1);

		int s = 7;
		int t = 1;

		while ( r[s]==-1 ) {
			if ( s%k==0 ) {
				System.out.println(t);
				System.exit(0);
			}
			r[s] = s%k;
			s = ( s*10 + 7 ) % k ;
			t++;
		}
		System.out.println("-1");
	}
}