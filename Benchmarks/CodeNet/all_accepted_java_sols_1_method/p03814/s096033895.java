import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int a = 0;
		int z = 0;

		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == 'A') {
				a = i;
				break;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == 'Z') {
				z = i;
			}
		}
		System.out.println(z - a + 1);
	}
}