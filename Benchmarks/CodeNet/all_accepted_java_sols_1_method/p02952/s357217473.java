import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		int temp = 0;
		int one = N / 10;
		if (one == 0) {
			System.out.println(N % 10);
			return;
		}
		temp += 9;
		int three = N / 1000;
		if (three == 0) {
			if (N > 99) {
				System.out.println(temp + N - 99);
				return;
			} else {
				System.out.println(temp);
				return;
			}
		}
		temp += 999 - 99;
		if (N > 9999 && N < 100000) {
			System.out.println(temp + N - 9999);
		} else if (N > 9999) {
			System.out.println(temp + N - 9999 - 1);
		} else {
			System.out.println(temp);
			return;
		}
	}
}