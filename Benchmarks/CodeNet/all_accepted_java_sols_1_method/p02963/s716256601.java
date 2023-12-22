import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long S = scn.nextLong();
		long X1, X2=-1, X3, Y1, Y2, Y3=-1;
		X1 = 0;
		Y1 = 0;

		if (S == 1000000000000000000L) {
			X2 = 0;
			Y3 = 0;
			Y2 = 1000000000L;
			X3 = 1000000000L;
		} else {
			long T = (long) Math.sqrt(S) + 1;
			Y2 = T;
			X3 = T;

			long SS = Y2 * X3 - S;

			for(long i = 1;i <= Math.sqrt(SS);i++) {
				if(SS%i==0) {
					X2 = i;
					Y3 = SS/i;
					if((X2 <= 1000000000L) && (Y3 <= 1000000000L))break;
				}
			}

		}
			System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
	}
}