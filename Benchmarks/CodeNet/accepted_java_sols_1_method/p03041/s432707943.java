import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]) - 1;

		String s = br.readLine();
		br.close();

		String s1 = s.substring(0, k);
		String s2 = s.substring(k, k + 1).toLowerCase();
		String s3 = s.substring(k + 1, n);
		System.out.println(s1 + s2 + s3);
	}
}
