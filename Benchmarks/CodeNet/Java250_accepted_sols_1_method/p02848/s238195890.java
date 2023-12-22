import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		char[] s = S.toCharArray();
		for(int i=0;i<S.length();i++) {
			char c = s[i];
			int x = (int)c;
			int y = (x+N-(int)'A')%26;
			x = (int)'A'+y;
			s[i] = (char) x;
		}
		String ans = String.copyValueOf(s);
		System.out.println(ans);
	}
}