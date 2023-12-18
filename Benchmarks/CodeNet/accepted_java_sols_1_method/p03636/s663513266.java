import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		sc.close();
		String ans = "";
		
		int length = s.length() - 2;
		ans += s.charAt(0);
		ans += Integer.toString(length);
		ans += s.charAt(length + 1);
		System.out.println(ans);
	}

}
