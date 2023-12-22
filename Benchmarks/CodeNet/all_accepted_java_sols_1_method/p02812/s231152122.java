import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		char[] s = sc.next().toCharArray();
		int count = 0;
		for (int i = 2; i < s.length; i++) {
			if(s[i-2] == 'A' && s[i-1] == 'B'&& s[i] == 'C') count++;
		}
		System.out.println(count);
		sc.close();
	}
}