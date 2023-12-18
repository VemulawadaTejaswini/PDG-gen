import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		ArrayList<Integer> array = new ArrayList<Integer>();
 		int min = Integer.MAX_VALUE;
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		for(int i = 0;i<n;i++){
 			array.add(Integer.parseInt(st.nextToken()));
 		}
 		for(int i = 1;i<=100;i++){
 			int sum = 0;
 			for(int j= 0;j<array.size();j++){
 				sum+= (array.get(j)-i)*(array.get(j)-i);
 			}
 			min = Math.min(sum,  min);
 		}
 		
 		
 		out.println(min);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


