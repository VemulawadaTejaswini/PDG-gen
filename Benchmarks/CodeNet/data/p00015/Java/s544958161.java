import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		for (int i=0; i < N; i++) {
			String n = sc.next();
			String m = sc.next();
//			System.out.println(n + "#" + m);
			System.out.println(calc(n, m));
		}
	}

	public static String calc(String n, String m) {
		if (n.length() > 80 || m.length() > 80) return "overflow";

		char[] cn = n.toCharArray();
//		char[] cm = n.toCharArray(); miss!
		char[] cm = m.toCharArray();

		if (cn.length < cm.length) {
			char[] temp = cn;
			cn = cm;
			cm = temp;
		}
//		System.out.println(Arrays.toString(cn));
//		System.out.println(Arrays.toString(cm));
		int nlen = cn.length;
		int mlen = cm.length;
		// nlen >= mlen
		byte[] ans = new byte[nlen];

		byte carry = 0; // kuriagari
		for (int i=nlen-1, j=mlen-1; 0 <= j; ) {
			if (cn[i] - '0' + cm[j] - '0' + carry > 9) {
				ans[i] = (byte) (cn[i] - '0' + cm[j] - '0' + carry - 10);
//				System.out.println(ans[i]);
				carry = 1;
			} else {
				ans[i] =  (byte) (cn[i] - '0' + cm[j] - '0' + carry);
				carry = 0;
			}
			j--;
			i--;
		}
		// x+mlen = nlen
		for (int i = nlen - mlen - 1; 0 <= i; i--) {
			if (cn[i] - '0' + carry > 9) {
				ans[i] = 0;
				carry = 1;
			} else {
				ans[i] = (byte) (cn[i] - '0' + carry);
				carry = 0;
			}
		}

		if (nlen == 80 && carry == 1) return "overflow";

		StringBuilder ansstr = new StringBuilder();
		if (carry == 1) ansstr.append(1);
		for (int i=0; i < ans.length; i++) {
			ansstr.append(ans[i]);
		}
		return ansstr.toString();
	}
}