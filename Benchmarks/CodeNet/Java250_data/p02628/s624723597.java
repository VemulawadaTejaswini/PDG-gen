import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] prices = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i <prices.length; i++)
			prices[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(prices);
		
		int sum = 0;
		for(int i=0; i<K; i++)
			sum += prices[i];
		
		bw.write(sum + "\n");
		bw.flush();
	}

}
