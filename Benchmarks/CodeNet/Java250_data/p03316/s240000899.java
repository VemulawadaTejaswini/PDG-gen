import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = Long.parseLong(s);
		long l = 0;
		for(char c : s.toCharArray()) {
			l+=c-'0';
		}
		System.out.println(n%l==0?"Yes":"No");
	}
}