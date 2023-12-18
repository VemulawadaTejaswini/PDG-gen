public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int cnt = 0;

			for (int i = a; i <= b; i++) {
				cnt = (c % i == 0) ? cnt + 1 : cnt;
			}

			System.out.println(cnt);
		}
	}
}
