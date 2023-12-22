import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		String ans = "No";
		for(int i=0;i<T.length();i++) {
			String newT = T.substring(i)  + T.substring(0,i);
			if(S.equals(newT)) {
				ans = "Yes";
				break;
			}
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
