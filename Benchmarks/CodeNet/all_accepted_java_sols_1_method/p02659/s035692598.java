import java.util.*;
import java.io.*;
public class Main {
 
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 
		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		long a = Long.parseLong(st.nextToken());
 		double b = Double.parseDouble(st.nextToken());
 		int c = (int)(b*100.0001);
 		long d = a*(long)(c);
 		out.println((d-((a%100)*(c%100))%100)/((long)(100)));
 		out.close();
 		
 	}
 
}