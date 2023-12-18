import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		int[] array = new int[n];
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		for(int i =0 ;i<n;i++){
 			array[i] = Integer.parseInt(st.nextToken());
 		}
 		if (array[0] >=array[1]){
 			if ((array[0] + array[1] )%2==0){
 				int mean = (array[0] + array[1])/2;
 				int ans = array[0]-mean;
 				array[0] = mean;
 				array[1] = mean;
 				if (n%2 == 0){
 					boolean s = true;
 					for(int i = 0;i<n;i++){
 						if (array[i] != mean)
 							s = false;
 					}
 					if (s)
 						out.println(ans);
 					else
 						out.println(-1);
 				}
 				else{
 					out.println(-1);
 				}
 				
 			}
 			else{
 				out.println(-1);
 			}
 		}
 		else{
 			out.println(-1);
 		}
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


