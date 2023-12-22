import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out);) {
			String[] AB = br.readLine().split(" ");
			int A = Integer.parseInt(AB[0]);
			int B = Integer.parseInt(AB[1]);
			String[] S = br.readLine().split("-");
			if (S.length == AB.length && A - B == S[0].length() - S[1].length()) {
				pw.println("Yes");
			} else {
				pw.println("No");
			}
			pw.flush();
		} catch (Exception e) {
		}
	}
}