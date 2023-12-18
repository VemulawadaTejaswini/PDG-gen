import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		int x = Integer.parseInt(st.nextToken());
	 		int n = Integer.parseInt(st.nextToken());
	 		
	 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
	 		Set<Integer> no = new HashSet<Integer>();
	 		for(int i = 0;i<n;i++){
	 			no.add(Integer.parseInt(st1.nextToken()));
	 		}
	 		boolean negative = true;
	 		if (!no.contains(x)){
	 			out.println(x);
	 		}
	 		else{
	 		for(int i = 1;i<301;i++){
	 			if (negative == true){
	 				x = x-i;
	 				negative = false;
	 			}
	 			else{
	 				x = x+i;
	 				negative = true;
	 			}
	 			if (!no.contains(x)){
	 				out.println(x);
	 				out.close();
	 			}
	 			
	 		}
 		
	 		}
	 		
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


