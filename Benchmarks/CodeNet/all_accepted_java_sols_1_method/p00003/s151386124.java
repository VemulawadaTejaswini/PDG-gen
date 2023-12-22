public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a >= b && a >= c) {
				if (a*a == b*b + c*c) System.out.println("YES");
				else System.out.println("NO");
			} else if (b >= c && b >= a) {
				if (b*b == c*c + a*a) System.out.println("YES");
				else System.out.println("NO");
			} else { // c >= a && c >= b
				if (c*c == a*a + b*b) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}

}