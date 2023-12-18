import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out);) {
			int[] AB = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			String[] S = br.readLine().split("-");
			if (S.length == AB.length && AB[0] - AB[1] == S[0].length() - S[1].length()) {
				pw.println("Yes");
			} else {
				pw.println("No");
			}
			pw.flush();
		} catch (Exception e) {
		}
	}
}