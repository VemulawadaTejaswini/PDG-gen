import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		char[] ch = s.toCharArray();
		if ((ch[0] == ch[1] && ch[0] == ch[2]) || (ch[1] == ch[2] && ch[1] == ch[3])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
