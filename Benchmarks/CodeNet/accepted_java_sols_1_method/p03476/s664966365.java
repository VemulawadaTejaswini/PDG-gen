import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Q = Integer.parseInt(br.readLine());
		
		boolean seive[] = new boolean[200000];
		
		seive[0] = seive[1] = true;
		
		for(int i = 2; i<200000; i++) {
			if(!seive[i]) {
				for(int j = i*2; j<200000; j += i) {
					seive[j] = true;
				}
			}
		}
		
		int pre[] = new int[200000];
		
		for(int i = 3; i<200000; i++) {
			pre[i] = pre[i-1];
			if(!seive[i] && !seive[(i+1)/2]) pre[i]++;
		}
		
		for(int q = 0; q<Q; q++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			System.out.println(pre[b] - pre[a-1]);
		}
		
	}

}
