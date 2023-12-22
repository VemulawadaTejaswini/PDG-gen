import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<s.length();i++) {
			if (i%2==0) {
				sb.append('0');
			} else {
				sb.append('1');
			}
		}
		String zero = sb.toString();
		sb = new StringBuffer();
		for (int i=0;i<s.length();i++) {
			if (i%2==1) {
				sb.append('0');
			} else {
				sb.append('1');
			}
		}
		String one = sb.toString();
		int z =0;
		int o=0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)==zero.charAt(i)) {
				z++;
			} else {
				o++;
			}
		}
		System.out.println(Math.min(z, o));
	}
}