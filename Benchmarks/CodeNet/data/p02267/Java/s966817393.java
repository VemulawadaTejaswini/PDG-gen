import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		

		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			hashSet.add(Integer.parseInt(strArray[i]));
		}
		int q = Integer.parseInt(reader.readLine());
		strArray = reader.readLine().split(" ");
		int[] targets = new int[q];
		for (int i = 0; i < q; i++) {
			targets[i] = Integer.parseInt(strArray[i]);
		}		
	
		int ans = 0;
		for (int i = 0; i < q; i++) {
			if (hashSet.contains(targets[i])) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
