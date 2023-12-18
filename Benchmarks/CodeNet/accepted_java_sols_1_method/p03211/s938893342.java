import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < S.length() - 2; ++i) {
			String tmp = S.substring(i, i + 3);
			if (Math.abs(Integer.parseInt(tmp) - 753) < min) min = Math.abs(Integer.parseInt(tmp) - 753);
		}
		System.out.print(min);
	}
}