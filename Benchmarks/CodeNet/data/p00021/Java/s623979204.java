import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while (n-- > 0) {
			float xa = sc.nextFloat();
			float ya = sc.nextFloat();

			float xb = sc.nextFloat();
			float yb = sc.nextFloat();

			float xc = sc.nextFloat();
			float yc = sc.nextFloat();

			float xd = sc.nextFloat();
			float yd = sc.nextFloat();

			float katamukiab = (yb-ya) / (xb -xa);
			float katamukicd = (yd-yc) / (xd -xc);

			if (katamukiab == katamukicd) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}