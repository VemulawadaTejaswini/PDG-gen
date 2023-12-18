import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();
		String t = sc.nextLine();
		String T = t;
		while (true) {
			t = sc.nextLine();
			if (t.equals("END_OF_TEXT"))
				break;
			T += " " + t;
		}
		int count = 0;
		int result = 0;
		T = " " + T.toLowerCase() + " ";
		while (true) {
			result = T.indexOf(" " + W + " ");
			if (result == -1) {
				break;
			} else {
				count++;
				T = T.substring(result + W.length() + 1);
			}
		}
		System.out.println(count);
	}
}
