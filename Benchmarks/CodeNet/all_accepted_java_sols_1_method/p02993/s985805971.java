import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "Good";
		for(int i = 0 ; i < s.length() - 1 ; i++) {
			if(s.charAt(i) == s.charAt(i + 1))
				ans = "Bad";
		}
		sc.close();
		System.out.println(ans);

	}
}

