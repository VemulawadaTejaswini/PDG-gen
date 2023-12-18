import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);

//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		int n = Integer.parseInt(st.nextToken());
	 		int m = Integer.parseInt(st.nextToken());
	 		ArrayList<Integer> array = new ArrayList<Integer>();
	 		StringTokenizer st2 = new StringTokenizer(bf.readLine());
	 		for(int j=0;j<n;j++){
	 			array.add(Integer.parseInt(st2.nextToken()));
	 		}
	 		Collections.sort(array);
	 		int sum = 0;
	 		for(int i = 0;i<m;i++){
	 			sum+= array.get(i);
	 		}
 		
 		out.println(sum);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


