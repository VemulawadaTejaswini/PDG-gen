import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		boolean n = false;
		boolean s = false;
		boolean w = false;
		boolean e = false;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case 'N':
				n = true;
				break;
			case 'S':
				s = true;
				break;
			case 'W':
				w = true;
				break;
			case 'E':
				e = true;
				break;
			default:
				System.out.println("error!");
				return;
			}
		}

//		System.out.println("n && s : " + (n && s));
//		System.out.println("!n && !s : " + (!n && !s));
//		System.out.println("w && e : " + (w && e));
//		System.out.println("!w && !e : " + (!w && !e));

		boolean isHome =  ((n && s) || (!n && !s))
							&& ((w && e) || (!w && !e));
		System.out.println(isHome ? "Yes" : "No");

		sc.close();
	}

}
