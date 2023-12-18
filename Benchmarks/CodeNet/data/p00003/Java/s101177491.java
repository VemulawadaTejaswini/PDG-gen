public class Main{
	public static void main(String[] args) {

		int n = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i < n; i++){

			int a = new java.util.Scanner(System.in).nextInt();
			int b = new java.util.Scanner(System.in).nextInt();
			int c = new java.util.Scanner(System.in).nextInt();

			if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a )
			{ System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}