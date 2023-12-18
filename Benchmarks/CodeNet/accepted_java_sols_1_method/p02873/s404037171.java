import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		int n = s.length + 1;
		int[] arr = new int[n];

		for ( int i = 0; i <= n - 2; i++ ) {
			if ( s[i] == '<' ) {
				arr[i + 1] = arr[i] + 1;
			}
		}

		long ans = 0;
		for ( int i = n - 2; 0 <= i; i-- ) {

			if ( s[i] == '>' ) {

				if ( i <= 0 ) {
					arr[i] = arr[i + 1] + 1;
				} else if ( s[i - 1] == '<' ) {
					arr[i] = Math.max(arr[i], arr[i + 1] + 1);
				} else if ( s[i - 1] == '>' ) {
					arr[i] = arr[i + 1] + 1;
				}
			}

			ans += arr[i];
		}
		ans += arr[n - 1];

		System.out.println(ans);
	}
}