import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) {
		int m=0,n=0;
		String s=null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			s=br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			m=Integer.parseInt(st.nextToken());
			n=Integer.parseInt(st.nextToken());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(m*n+" "+2*(m+n));
		
		
	}
}

