import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char L = 'L', R = 'R';
		boolean r = false;
		for(int i = 0; i < s.length; i++) {
			if(((i + 1) % 2 == 0 && s[i] == R) 
			|| ((i + 1) % 2 != 0 && s[i] == L))
				r = true;
		}
		sc.close();
		System.out.println(r ? "No" : "Yes");
	}
}
