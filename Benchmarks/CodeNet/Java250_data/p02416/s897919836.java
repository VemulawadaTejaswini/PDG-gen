import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
//
//		while (true) {
//			long x = scan.nextLong();
//			if (x == 0l) {break;}
//			long sum = 0l;
//			while (x != 0l) {
//				sum += x % 10l;
//				x /= 10l;
//			}
//			sb.append(sum + "\n");
//		}
//		System.out.print(sb);

		while (true) {
			String x = scan.next();

			if ( x.equals("0") ) {break;}

			char[] xx = x.toCharArray();
			int l = xx.length;
			int sum = 0;
			for (int i = 0; i < l; i++) {
				sum += Character.getNumericValue(xx[i]);
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb);
	}

}