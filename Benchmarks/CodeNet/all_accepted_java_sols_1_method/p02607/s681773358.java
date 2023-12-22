import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		
	 		ArrayList<Integer> array = new ArrayList<Integer>();
	 		StringTokenizer st2 = new StringTokenizer(bf.readLine());
	 		for(int j=0;j<n;j++){
	 			array.add(Integer.parseInt(st2.nextToken()));
	 		}
	 		int count = 0;
	 	for(int i = 0;i<array.size();i++){
	 		if (array.get(i)%2 == 1 && (i+1)%2 == 1)
	 			count++;
	 	}
 		
 		
 		out.println(count);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


