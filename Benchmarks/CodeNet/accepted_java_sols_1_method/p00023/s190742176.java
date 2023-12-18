import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N-- > 0) {
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();

			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();

			double ABAB = (xa-xb)*(xa-xb) + (ya-yb)*(ya-yb);
			if ( ABAB > (ra+rb)*(ra+rb) ) {
				System.out.println(0);
			} else if ( (rb-ra)*(rb-ra) > ABAB ) {
				if (rb > ra) System.out.println(-2);
				else System.out.println(2);
			} else {
				System.out.println(1);
			}
		}
	}

}