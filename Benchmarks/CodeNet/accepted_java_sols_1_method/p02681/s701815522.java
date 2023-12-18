import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		String is = null;
		if(t.matches(s + "[a-z]")) {
			is = "Yes";
		}
		else {
			is = "No";
		}
		System.out.println(is);
	}
}
