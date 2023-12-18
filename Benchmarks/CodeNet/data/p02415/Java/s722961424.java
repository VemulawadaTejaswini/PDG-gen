import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			String s = sc.nextLine();

			for (int i=0; i<s.length(); i++) {
				int a = s.charAt(i);
				if ((a>=65) && (a<=90)) {
					a += 32;
					System.out.print(Character.toChars(a));
				}
				else if ((a>=97) && (a<=122)) {
					a -= 32;
					System.out.print(Character.toChars(a));
				} else System.out.print(s.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

