import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] assign = new int[M];
		int vacation = 0, sum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			assign[i] = Integer.parseInt(st.nextToken());
			sum += assign[i];
		}
		
		vacation = N - sum;
		if(vacation < 0)
			bw.write(-1 + "\n");
		else
			bw.write(vacation + "\n");
		bw.flush();
	}

}
