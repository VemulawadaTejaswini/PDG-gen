import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		for(int i=0;i<N;i++) {
			String[] lc = br.readLine().split(" ");
			int a = Integer.parseInt(lc[0]);
			int b = Integer.parseInt(lc[1]);
			int c = Integer.parseInt(lc[2]);
			
			if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b)
			{
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}
}