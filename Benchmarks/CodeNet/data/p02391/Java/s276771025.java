import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] st = s.split(s);
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else if (a == b) {
			System.out.println("a == b");
		}
	}

}