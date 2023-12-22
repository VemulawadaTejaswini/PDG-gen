import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		sc.close();

		char[] s = S.toCharArray();
		char[] t = T.toCharArray();

		int ans = 0;

		for(int i=0;i<s.length;i++) {
			if(s[i]==t[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
