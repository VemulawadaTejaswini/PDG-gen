import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();

		int ans = t.length;

		for(int i = 0; i <= s.length - t.length; i++) {
			int diff = 0;
			for(int x = 0; x < t.length; x++) {
				if(t[x] != s[i+x]) {
					diff++;
				}
			}
			ans = ans <= diff ? ans : diff;
		}

		System.out.println(ans);
	}
}
