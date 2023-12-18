import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		int a = 0;
		int b = 0;

		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(gcd(a,b));

			}

		} finally {
			sc.close();
		}

	}

	public static int gcd(int a, int b) {
		int x = 0;
		if (a < b) {
			x = a;
			a = b;
			b = x;
		}
		while(a!=0){
			a=a%b;
			b=b%a;
		}

		return b;
	}

}