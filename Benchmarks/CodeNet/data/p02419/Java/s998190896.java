import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String W = in.next().toLowerCase();
		String T = new String();
		int cnt = 0;
		while (!in.hasNext("END_OF_TEXT")) {
			T = in.next().toLowerCase();
			if (T.matches(W)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}