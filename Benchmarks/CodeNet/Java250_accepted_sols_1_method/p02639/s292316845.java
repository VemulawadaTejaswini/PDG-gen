import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] x = new int[5];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<5; i++) {
			x[i] = Integer.parseInt(st.nextToken());
			
			if(x[i] == 0)
				sb.append(i+1 + "\n");
		}
		
		System.out.println(sb);
		
	}

}