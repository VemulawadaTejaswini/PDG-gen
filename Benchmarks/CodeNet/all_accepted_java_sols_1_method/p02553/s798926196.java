import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		if (a>=0&&c>=0) {
			System.out.println(b*d);
		} else if (b<=0&&d<=0) {
			System.out.println(a*c);
		} else {
			long t[] = new long[4];
			t[0] = a*c;
			t[1] = a*d;
			t[2]= b*c;
			t[3] = b*d;
			Arrays.sort(t);
			if (t[3]>=0) {
				System.out.println(t[3]);
			} else {
				if ((b>0&&a<0)||(d>0&&c<0)) {
					System.out.println(0);
				} else {
					System.out.println(t[3]);
				}
			}
		}
	}
}