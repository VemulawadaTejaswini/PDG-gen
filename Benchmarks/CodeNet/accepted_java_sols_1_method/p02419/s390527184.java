import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String W, T = "";
		int count = 0;

		Scanner sc = new Scanner(System.in);
		W = sc.next();
		while (T.compareTo("END_OF_TEXT") != 0) {
			T = sc.next();
			if (W.compareToIgnoreCase(T) == 0) {
				++count;
			}
		}
		System.out.println(count);
		sc.close();
	}
}

