import java.io.*;
import java.util.*;

class Main{
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line," ");
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int d = a/b;
		int r = a%b;
		String f = (String.format("%.5f",a/b));
		
		String str = d +" "+ r +" "+ f +"\n";
		sb.append(str);
		System.out.println(sb);
	}
}