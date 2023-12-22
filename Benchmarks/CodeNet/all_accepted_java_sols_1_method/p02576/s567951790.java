import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		int i = 1;
		int ans = 0;
		while(true) {
			ans += T;
			if(N <= (X * i))
				break;
			i++;
		}
		
		System.out.println(ans);
	}

}