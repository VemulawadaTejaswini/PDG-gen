import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int ptTaro = 0,ptHanako = 0, n;
		String wdTaro,wdHanako;
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			wdTaro = st.nextToken();
			wdHanako = st.nextToken();
			if (wdTaro.compareTo(wdHanako) > 0) {
				
				ptTaro += 3;
				
			} else if (wdTaro.compareTo(wdHanako) < 0) {
				
				ptHanako += 3;
				
			} else {
				
				ptTaro++;
				ptHanako++;
				
			}
			
		}
		System.out.println(ptTaro + " " + ptHanako);
		
	}
	
}