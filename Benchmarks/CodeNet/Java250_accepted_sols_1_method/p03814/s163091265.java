import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a =0;
		for (;a<s.length();a++) {
			if (s.charAt(a)=='A') {
				break;
			}
		}
		for (int i=s.length()-1;i>=0;i--) {
			if (s.charAt(i)=='Z') {
				System.out.println(i-a+1);
				break;
			}
		}
	}
}