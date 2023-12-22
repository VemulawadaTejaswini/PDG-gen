import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		boolean [] isVisit = new boolean[101];

		if(n > 0){
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()){
				int cur = Integer.parseInt(st.nextToken());
				isVisit[cur] = true;
			}
		}

		int l = x, r = x;
		while(l > 0 && isVisit[l]) l--;
		while(r < 101 && isVisit[r]) r++;

		bw.write((x - l <= r - x ? l : r )+"" );
		bw.flush();
		bw.close();
		br.close();
	}
}