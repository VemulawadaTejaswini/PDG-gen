import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder buf = new StringBuilder();
		
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		
		if (a > b) {
			for (int i=0; i<a; i++) {
				buf.append(strB);
			}
			System.out.println(buf);
		} else {
			for (int i=0; i<b; i++) {
				buf.append(strA);
			}
			System.out.println(buf);
		}
	}
}