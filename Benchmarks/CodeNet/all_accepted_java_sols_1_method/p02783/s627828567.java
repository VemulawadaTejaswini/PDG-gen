import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int i;
		for(i=1; i<10001; i++) {
			H -= A;
			if(H <= 0)
				break;
		}
		
		System.out.println(i);
	}	

}