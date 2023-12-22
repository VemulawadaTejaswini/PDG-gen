import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int i = 0;
		while(i <= x){
			if(2*i + (x-i)*4 == y){
				break;
			}
			i++;
		}

		bw.write((i <= x ? "Yes" : "No"));
		bw.flush();
		bw.close();
		br.close();
	}
}