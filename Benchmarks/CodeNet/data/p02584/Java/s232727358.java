import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		long x = Long.parseLong(st.nextToken());
 		long k = Long.parseLong(st.nextToken());
 		long d = Long.parseLong(st.nextToken());
 		
	 	if (sign(x) == -1 && k <= (0-x)/d)
	 		out.println(Math.abs(x+k*d));
	 	else if (sign(x) == 1 && k <= x/d)
	 		out.println(Math.abs(x-k*d));
	 	else{
	 		if (k%2 == 0)
	 			out.println(Math.min(Math.abs((x%(2*d)+2*d)%(2*d)), Math.abs((x%(2*d)+(2*d))%(2*d)-2*d)));
	 		else{
	 			out.println(Math.abs((x%(2*d)+(2*d))%(2*d)-d));
	 		}
	 	}

 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
	public static int sign(long j){
		if (j < 0)
			return -1;
		else if (j > 0)
			return 1;
		else
			return 0;
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


