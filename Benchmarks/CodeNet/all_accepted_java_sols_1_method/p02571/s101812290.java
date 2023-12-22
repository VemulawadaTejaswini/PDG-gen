import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();

		char[] s = S.toCharArray();
		char[] t = T.toCharArray();

		int ls = S.length();
		int lt = T.length();

		int ans = lt;

		for(int i=0;i<=ls-lt;i++) {
			int cnt = 0;
			for(int j=0;j<lt;j++) {
					if(t[j]!=s[i+j]) {
						cnt++;
					}
			}
			if(cnt<ans) {
				ans = cnt;
			}
		}
		System.out.println(ans);
	}
}