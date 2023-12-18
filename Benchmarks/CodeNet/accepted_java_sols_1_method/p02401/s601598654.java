import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int a = sc.nextInt();
				String OP = sc.next();
				char op = OP.charAt(0);
				int b = sc.nextInt();

				if (op == '?') break;

				int ans = 0;

				switch (op) {
					case '+':
						ans = a+b;
						break;

					case '-':
						ans = a-b;
						break;
						
					case '*':
						ans = a*b;
						break;
						
					case '/':
						ans = (int) Math.floor(a/b);
						break;
				}
				System.out.println(ans);
			}
		}
	}

}
