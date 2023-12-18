import java.text.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kazu = scan.nextInt();
		int num[][][] = new int[4][3][10];
		int b,f,r,v;
		
		for(int i = 0; i < kazu; i++) {
			b = scan.nextInt() - 1;
			f = scan.nextInt() - 1;
			r = scan.nextInt() - 1;
			v = scan.nextInt();
			num[b][f][r] += v;
		}
		for(int i0 = 0; i0 < 4; i0++ ) {
			for(int i1 = 0; i1 < 3; i1++) {
				for(int i2 = 0; i2 < 10; i2++) {
					System.out.print(" " + num[i0][i1][i2]);
				}
				System.out.println();
			}
			if(i0 < 3) System.out.println("####################");
		}
	}
}