import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		char[] ch = s.toCharArray();
		if (ch[0] == '9' || ch[1] == '9') {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}