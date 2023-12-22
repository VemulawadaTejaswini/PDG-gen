import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		String s = sc.next();
		if(s.length() == a+b+1 &&
			s.indexOf("-") == a &&
			s.indexOf("-") == s.lastIndexOf("-")) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}
