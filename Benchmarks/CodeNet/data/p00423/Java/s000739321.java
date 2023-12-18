import java.io.*;
import java.util.*;

public class Main {
	static public void main(String[] argv) {
		try{
//			FileReader file_in = new FileReader("test.txt");
//			BufferedReader d = new BufferedReader( file_in );
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
	
			while(true) {
				String buf = d.readLine();
				
				int num = Integer.valueOf(buf);
				if( num == 0 ) break;
				
				int res_a = 0;
				int res_b = 0;
				
				for(int i = 0; i < num; i++) {
					buf = d.readLine();
					StringTokenizer st = new StringTokenizer(buf);
					
					int cur_a = Integer.valueOf(st.nextToken());
					int cur_b = Integer.valueOf(st.nextToken());
					
					if( cur_a > cur_b ) {
						res_a += cur_a;
						res_a += cur_b;
					} else if( cur_a == cur_b ) {
						res_a += cur_a;
						res_b += cur_b;
					} else {
						res_b += cur_a;
						res_b += cur_b;
					}
				}
				
				System.out.println(res_a + " " + res_b);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}