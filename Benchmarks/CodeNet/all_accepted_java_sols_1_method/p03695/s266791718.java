import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] ary = new boolean[8];
		Arrays.fill(ary, Boolean.FALSE);
		int maximum = 0;
		int minimum = 0;
		
		int t = 0;
		for ( int i = 0; i < n; i++ ) {
			t = in.nextInt();
			if ( t >= 1 && t <= 399 )
				ary[0] = true;
			else if ( t >= 400 && t <= 799 )
				ary[1] = true;
			else if ( t >= 800 && t <= 1199 )
				ary[2] = true;
			else if ( t >= 1200 && t <= 1599 )
				ary[3] = true;
			else if ( t >= 1600 && t <= 1999 )
				ary[4] = true;
			else if ( t >= 2000 && t <= 2399 )
				ary[5] = true;
			else if ( t >= 2400 && t <= 2799 )
				ary[6] = true;
			else if ( t >= 2800 && t <= 3199 )
				ary[7] = true;
			else if ( t >= 3200 )
				maximum++;
		}
		
		for (int i = 0; i < 8; i++ ) {
			if (ary[i]) {
				minimum++;
				maximum++;
			}
		}
		
		if ( minimum == 0 && maximum > 0 )
			minimum = 1;
		
		System.out.println(minimum + " " + maximum);
	}
}