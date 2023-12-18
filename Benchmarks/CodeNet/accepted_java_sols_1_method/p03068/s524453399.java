import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////		String line = reader.readLine();
//		String[] str = reader.readLine().split(" ");
//		int[] ab = new int[str.length];
//		for (int i = 0; i < str.length; i++) {
//			ab[i] = Integer.parseInt(str[i]);
//		}
//		if ((ab[0] > ab[2] && ab[2] > ab[1]) || (ab[0] < ab[2] && ab[2] < ab[1])) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		String[] str = reader.readLine().split("");
		line = reader.readLine();
		int K = Integer.parseInt(line) -1;
		String[] re = new String[N];
		for (int i = 0; i < N; i++) {
			if (!str[i].equals(str[K])) {
				re[i] = "*";
			}
			else {
				re[i] = str[i];
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(re[i]);
		}
		System.out.println();
	}
}