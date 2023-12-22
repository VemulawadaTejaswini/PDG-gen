public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int m1 = java.lang.Math.min(a,b);
		int m2 = java.lang.Math.max(a,b);

		if (c < m1) {
			System.out.println(c + " " + m1 + " " + m2);
		}else if (m2 < c) {
			System.out.println(m1 + " " + m2 + " " + c);
		}else {
			System.out.println(m1 + " " + c + " " + m2);
		}


	}
}