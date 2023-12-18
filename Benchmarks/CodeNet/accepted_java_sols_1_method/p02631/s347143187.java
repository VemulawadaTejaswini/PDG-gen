import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int[] array = new int[n];
 		int temp = 0;
 		for(int i = 0;i<n;i++){
 			array[i] = Integer.parseInt(st.nextToken());
 			if (i >= 1){
 				temp = temp^array[i];
 			}
 			
 		}
 		int[] ans = new int[n];
 		ans[0] = temp;
 		for(int i = 1;i<n;i++){
 			ans[i] = array[0]^array[i]^ans[0];
 		}
 		for(int i = 0;i<n;i++){
 			out.print(ans[i] + " ");
 		}
 		out.println();
 		out.close();
 		
 		
 	}
}
 	