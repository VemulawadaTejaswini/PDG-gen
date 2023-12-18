import java.util.*;
import java.io.*;
public class C {
 
	public static void main(String[] args) throws Exception{
		long num = 1000000007;
 
		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		long sum =0;
 		long sumsq = 0;
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		for(int j =0;j<n;j++){
 			int k = Integer.parseInt(st.nextToken());
 			sum+=(long)(k);
 			sumsq+=(long)((long)(k)*(long)(k));
 			sumsq%=num;
 			sum%=num;
 		}
 		
 		long ans = sum*sum;
 		ans%=num;
 		ans-=sumsq;
 		ans = (ans%num+num)%num;
 		// if (ans%2 == 1)
 		// 	ans+=num;
 		ans/=2;
 		
 		out.println(ans);
	 		
 		out.close();
 		
 		
 		
 	}
}