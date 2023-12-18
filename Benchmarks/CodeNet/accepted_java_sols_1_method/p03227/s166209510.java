import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length() == 2) {
			System.out.println(s);
		} else {
			System.out.println(String.valueOf(s.charAt(2))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(0)));
		}
	}
}