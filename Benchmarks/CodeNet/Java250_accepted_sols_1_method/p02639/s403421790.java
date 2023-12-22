import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=1;i<6;i++){
			int cur = Integer.parseInt(st.nextToken());
			if(cur == 0){
				bw.write(i+"");
				break;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}