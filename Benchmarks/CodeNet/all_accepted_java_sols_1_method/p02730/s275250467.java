import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int nagasa = s.length();
		int hanbun = (nagasa - 1) / 2;
		boolean bool = true;
		for (int i = 0; i < hanbun; i++) {
			if (s.charAt(i) != s.charAt(nagasa - i - 1)) {
				bool = false;
				break;
			}
			if (s.charAt(i) != s.charAt(hanbun - i - 1)) {
				bool = false;
				break;
			}
			if (s.charAt(hanbun + i + 1) != s.charAt(nagasa - i - 1)) {
				bool = false;
				break;
			}
		}
		if (bool) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
