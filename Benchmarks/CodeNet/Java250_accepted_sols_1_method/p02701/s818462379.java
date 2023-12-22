import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());
			Set<String> set = new HashSet<String>();
			for (int i = 0; i < n; i++) {
				set.add(br.readLine());
			}
			System.out.println(set.size());
		}
	}
}