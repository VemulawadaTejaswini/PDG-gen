
import java.util.ArrayList;
import java.util.Scanner;

// *** at 2018/**/**

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveB();
	}

	public void solveA() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (n < k) {
			System.out.println(n * x);
		} else {
			System.out.println((k * x) + ((n - k) * y));
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		char ca[] = sc.nextLine().toCharArray();
		ArrayList<Character> used = new ArrayList<>();

		for (char w : ca) {
			if (!used.contains(w)) {
				if (!cnt(ca, w)) {
					System.out.println("No");
					return;
				}
				used.add(w);
			}
		}
		System.out.println("Yes");
	}
	private Boolean cnt(char[] ca, char t) {
		int cnt = 0;
		for (char w : ca) {
			if (t == w) cnt++;
		}
		if (cnt % 2 == 1) {
			return false;
		}
		return true;
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveF() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

}