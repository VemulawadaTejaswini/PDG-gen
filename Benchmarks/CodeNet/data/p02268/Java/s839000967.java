import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String s = in.readLine();
		int n = Integer.parseInt(s);
		s = in.readLine();
		int[] a = new int[n];
		String[] as = s.split(" ");
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(as[i]);
		}
		s = in.readLine();
		int q = Integer.parseInt(s);
		int[] t = new int[q];
		as = s.split(" ");
		for(int i = 0; i < q; i++) {
			t[i] = Integer.parseInt(as[i]);
		}
		int count = 0;
		for(int i = 0; i < q; i++) {
			int left = 0;
			int right = n;
			while (left != right) {
				int mid = (left + right) / 2;
				if(mid == t[i]) {
					count++;
				} else if(mid < t[i]) {
					 left = mid;
					 mid = (left + right) / 2;
				} else if(mid > t[i]) {
					right = mid;
					mid = (left + right) / 2;
				}
			}
		}
		System.out.println(count);
	}
	
	
}
