import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		int result = 0;
		for(int i = 0; i < S.length(); i++)
			if(S.charAt(i) != T.charAt(i))
				result++;
		System.out.println(result);
	}
}