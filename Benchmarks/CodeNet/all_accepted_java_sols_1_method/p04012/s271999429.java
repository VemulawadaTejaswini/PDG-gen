import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] alpha = new int[26];
		
		char[] s = in.next().toCharArray();
		for (int i = 0 ; i < s.length; i++) {
			alpha[s[i] - 'a']++;
		}
		
		boolean flag = true;
		for (int i = 0 ; i < 26; i++) {
			flag = (alpha[i] % 2 == 0);
			if (!flag)
				break;
		}
		
		if (flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
