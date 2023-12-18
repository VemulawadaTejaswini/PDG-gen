import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		String ans = "";
		for(int i = 0; i < 3; ++i) {
			s = sc.next();
			ans += s.charAt(i);
		}
		sc.close();
		System.out.println(ans);
	}

}
