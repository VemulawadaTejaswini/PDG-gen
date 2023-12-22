import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.nextLine().toCharArray();
		char[] t = scanner.nextLine().toCharArray();
		long ans = 0;

		for(int i = 0; i < s.length; i++) {

			if(s[i] != t[i]) ans++;

		}

 		System.out.println(ans);
	}
}
