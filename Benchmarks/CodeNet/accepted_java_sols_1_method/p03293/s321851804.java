import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		boolean ret = false;
		String tPrefix = t.substring(0, 1);
		String checkString = s;
		int prefIndex = checkString.indexOf(tPrefix);
		while (true) {
			checkString = s.substring(prefIndex);
			if (t.equals(checkString + s.substring(0, prefIndex))) {
				ret = true;
				break;
			}
			if (checkString.length() <= 1 || checkString.substring(1).indexOf(tPrefix) == -1) {
				break;
			}
			prefIndex += (checkString.substring(1).indexOf(tPrefix) + 1);
		}

		if (ret) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}