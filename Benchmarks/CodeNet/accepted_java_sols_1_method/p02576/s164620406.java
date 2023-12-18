

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int n = Integer.parseInt(st.nextToken());
		 int x = Integer.parseInt(st.nextToken());
		 int t = Integer.parseInt(st.nextToken());
	        
	        int ans=0;
	        while(n>0) {
	        	ans+=t;
	        	n=n>=x?n-x:0;
	        }
	        System.out.println(ans);
	        
	}

}
