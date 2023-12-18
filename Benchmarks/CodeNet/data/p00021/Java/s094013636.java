import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			BigDecimal ax = new BigDecimal(sc.next());
			BigDecimal ay = new BigDecimal(sc.next());

			BigDecimal bx = new BigDecimal(sc.next());
			BigDecimal by = new BigDecimal(sc.next());

			BigDecimal cx = new BigDecimal(sc.next());
			BigDecimal cy = new BigDecimal(sc.next());

			BigDecimal dx = new BigDecimal(sc.next());
			BigDecimal dy = new BigDecimal(sc.next());

			// y - ay = katamukiab * (x -ax)
			// by - ay = katamukiab * (bx - ax)
			// katamukiab = (by - ay) / (bx - ax)
			// katamukicd = (dy - cy) / (dx - cx)
//			if ( (by-ay)*(dx-cx) == (dy-cy)*(bx-ax) )
//				System.out.println("YES");
//			else
//				System.out.println("NO");
			BigDecimal temp1 = by.subtract(ay);
			BigDecimal temp2 = dx.subtract(cx);
			BigDecimal templeft = temp1.multiply(temp2);

			temp1 = dy.subtract(cy);
			temp2 = bx.subtract(ax);
			BigDecimal tempright = temp1.multiply(temp2);

			if ( templeft.compareTo(tempright) == 0 ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}