import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		long num = 1000000007;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int t = Integer.parseInt(bf.readLine());
 		if (t == 1)
 			out.println(0);
 		else{
 			long ans = power(10, t, num)-2*power(9, t, num)+power(8,t, num);
 			
 			out.println(((ans)%num+num)%num);
 		}
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
	public static int power(long x, long y, long mod){
		long ans = 1;
		while(y>0){
			if (y%2==1)
				ans = (ans*x)%mod;
			x = (x*x)%mod;
			y/=2;
		}
		return (int)(ans);
	}
	
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


