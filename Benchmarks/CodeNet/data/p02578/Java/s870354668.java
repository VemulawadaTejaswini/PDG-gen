import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int t = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		ArrayList<Integer> array = new ArrayList<Integer>();
 		for(int i = 0;i<t;i++){
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		
	 		array.add(Integer.parseInt(st.nextToken()));
 		}
 		long max = array.get(0);
 		long sum = 0;
 		for(int j = 1;j<t;j++){
 			if (array.get(j) < max){
 				sum+=(long)((max-array.get(j)));
 			}
 			else{
 				max = array.get(j);
 			}
 		}
 		
 		
 		out.println(sum);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


