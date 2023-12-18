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
 		int[] array = new int[n+1];
 		int[] prefix = new int[n+2];
 		prefix[0] = 0;
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		for(int i = 1;i<=n;i++){
 			array[i] = Integer.parseInt(st1.nextToken());
 		}
 		for(int i = 1;i<=n;i++){
 			prefix[i] = array[i]-array[i-1];
 		}
 		for(int i = 0;i<Math.min(k,  100);i++){
 			int[] newarray = new int[n+2];
 			int sum = 0;
 			for(int j = 1;j<=n;j++){
 				sum+=prefix[j];
 				newarray[Math.max(1,j-sum)]++;
 				newarray[Math.min(n+1, j+sum+1)]--;
 			}
 			for(int j = 1;j<=n;j++){
 				prefix[j] = newarray[j]+0;
 			}
 		}
 		int sum = 0;
 		for(int j = 1;j<=n;j++){
 			sum+= prefix[j];
 			out.print(sum + " ");
 		}
		
 		out.close();
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


