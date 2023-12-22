import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		for(int i = 0; i < s.length; i++) {
			if(s[i] == '7') {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
