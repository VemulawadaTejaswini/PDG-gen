import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int num = sc.nextInt();

		int a;
		int b;
		String replace;
		String input;

		for (int j = 0; j < num; j++) {
			input = sc.next();
			a = sc.nextInt();
			b = sc.nextInt();

			if (input.equals("print")) {
				System.out.println(str.substring(a, b+1));
			} else if (input.equals("reverse")) {
				char[] c1 = str.substring(a, b+1).toCharArray();
				String temp="";
				for (int i = 0; i < c1.length; i++) {
				    temp += c1[c1.length - 1 - i];
				}
				replace = temp;
				str = str.replace(str.substring(a, b+1), replace);
			} else {
				replace = sc.next();
				str = str.substring(0,a)+replace+str.substring(b+1);
			}
		}
	}

}
