import java.io.IOException;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();

		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			if (s[i] == t[i]) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}	
}