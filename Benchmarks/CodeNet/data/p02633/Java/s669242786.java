import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		boolean f = false;
		int t = 1;
		while ( !f ) {
			int tx = t*x;
			if ( tx%360==0 ) {
				f = !f;
			} else {
				t++;
			}
		}

		System.out.println(t);
	}
}