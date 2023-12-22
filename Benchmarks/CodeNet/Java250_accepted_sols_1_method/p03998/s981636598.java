import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();

			StringBuilder sba = new StringBuilder(a);
			StringBuilder sbb = new StringBuilder(b);
			StringBuilder sbc = new StringBuilder(c);

			char next = sba.charAt(0);
			sba.deleteCharAt(0);
			while (true) {
				switch (next) {
				case 'a' :
					if (sba.length() == 0) {
						System.out.println("A");
						return;
					}
					next = sba.charAt(0);
					sba.deleteCharAt(0);
					break;
				case 'b' :
					if (sbb.length() == 0) {
						System.out.println("B");
						return;
					}
					next = sbb.charAt(0);
					sbb.deleteCharAt(0);
					break;
				case 'c' :
					if (sbc.length() == 0) {
						System.out.println("C");
						return;
					}
					next = sbc.charAt(0);
					sbc.deleteCharAt(0);
					break;
				}
			}

		} finally {
			sc.close();
		}
	}
}