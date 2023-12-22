import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int hoge = 0;
		for(int i = 0; i < s.length();++i) {
			hoge += s.charAt(i) - 48;
		}
		System.out.println(Integer.valueOf(s) % hoge == 0 ? "Yes" : "No");
	}
}
