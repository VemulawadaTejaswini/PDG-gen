import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		String s = sc.next();
		for (int i=0;i<s.length();i++) {
			sum +=s.charAt(i)-'0';
		}
		if (sum %9==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}