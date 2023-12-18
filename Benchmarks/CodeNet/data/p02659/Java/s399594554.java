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
 		long c = (int)(b*100);
 		out.println((a*c-(a*c)%100)/100);
 		
 		out.println();
 		out.close();
 		
 	}
 
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is