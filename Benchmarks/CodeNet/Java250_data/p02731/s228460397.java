import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double l = kb.nextDouble();
//		double k1 = 1;
//		double k2 = 1;
//		double k3 = l-2;
//		double sum = k1 * k2 * k3;
//		// System.out.println(sum);
//		while (k1 <= l/3+1) {
//			k2 = k1;
//			k3 = l - k1 - k2;
//			while (k2 <= k3) {
//				double sum2 = k1 * k2 * k3;
//				if (sum < sum2)
//					sum = sum2;
//				k2 += 1;
//				k3 -= 1;
//			}
//			k1 += 1;
//		}
//		System.out.println(sum);
		double m = l/3;
		double n =l/3;
		l=l-m-n;
		System.out.println(l*m*n);
		kb.close();

	}
}
