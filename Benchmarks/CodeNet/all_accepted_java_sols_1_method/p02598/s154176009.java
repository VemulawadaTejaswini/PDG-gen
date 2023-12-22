import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int k = Integer.parseInt(st.nextToken());
 		int[] array = new int[n];
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		for(int j = 0;j<n;j++){
 			array[j] = Integer.parseInt(st1.nextToken());
 		}
 		long l = 1;
 		long r = 1000000000;
 		while(l<r){
 			long mid = (l+r)/2;
 			long count = 0;
 			for(int j = 0;j<n;j++){
 				count+=(array[j]-1)/mid;
 			}
 			if (count > k)
 				l = mid+1;
 			else
 				r = mid;
 		}
 		
 		
 		out.println(l);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


