import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			if (str[0].equals("insert")) {
				set.add(str[1]);
			} else if (set.contains(str[1])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
