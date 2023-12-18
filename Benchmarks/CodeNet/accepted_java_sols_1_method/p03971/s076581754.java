import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();

		int numOfPass = 0;
		int rankB = 0;

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			boolean isPass = false;

			switch (c) {
			case 'a':
				if (numOfPass < a + b) {
					numOfPass++;
					isPass = true;
				}
				break;
			case 'b':
				rankB++;
				if (numOfPass < a + b && rankB <= b) {
					numOfPass++;
					isPass = true;
				}
				break;
			case 'c':
				break;
			default:
				break;
			}

			System.out.println(isPass ? "Yes" : "No");
		}

		sc.close();
	}

}
