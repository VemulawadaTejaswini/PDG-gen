import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		int sum = 0, count = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		
		for(int i=0; i<N; i++) {
			if(arr[i] >= sum/(4.0 * M))
				count++;
		}
		
		StringBuilder sb = new StringBuilder();
		if(count >= M)
			sb.append("Yes\n");
		else
			sb.append("No\n");
		
		System.out.println(sb);
		
	}

}