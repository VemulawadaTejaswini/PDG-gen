import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long X = sc.nextLong();
		long Y = sc.nextLong();
		//boolean boo = false;
		if(A+B>C*2) {
			long min = Math.min(X, Y);
			long sum =C*2*min;
			if(min == X) {
				long div = Y-X;
				if(C*2*div<B*div) {
					sum+=C*2*div;
				}else {
					sum+=B*div;
				}
			}else if(min == Y) {
				long div = X-Y;
				if(C*2*div<A*div) {
					sum+=C*2*div;
				}else {
					sum+=A*div;
				}
			}
			System.out.println(sum);
		}else {
			System.out.println(A*X+B*Y);
		}
		
		//System.out.println();
		sc.close();
	}

}
