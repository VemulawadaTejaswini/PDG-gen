import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final String S = sc.next();
		final String T = sc.next();

		int cnt = 0;
		for(int i=0;i<3;i++) {
			if(S.charAt(i)==T.charAt(i)) {
				cnt++;
			}
		}
		out.println(cnt);

	}
}
