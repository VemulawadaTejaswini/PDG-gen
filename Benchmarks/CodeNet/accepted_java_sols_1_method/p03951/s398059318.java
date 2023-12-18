import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		int i = 0;
		while (i < n) {
			if (s.substring(i).equals(t.substring(0, n - i))) {
				System.out.println(n + i);
				return;
			}
			i++;
		}

		System.out.println(n * 2);
		sc.close();
	}

}
