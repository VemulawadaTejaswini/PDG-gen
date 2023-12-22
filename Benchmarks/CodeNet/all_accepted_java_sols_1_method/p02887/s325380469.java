import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		String input = sc.nextLine();
		sc.close();

		int count = 0;
		String before = "";
		for (String s : input.split("")) {
			if (!s.equals(before)) {
				count++;
				before = s;
			}
		}
		System.out.println(count);
	}
}
