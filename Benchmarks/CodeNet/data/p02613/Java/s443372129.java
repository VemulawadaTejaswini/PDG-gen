import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		Map<String, Integer> mp = new HashMap<String, Integer>();
 		mp.put("AC",  0);
 		mp.put("RE",  0);
 		mp.put("WA",  0);
 		mp.put("TLE",  0);
 		int t = Integer.parseInt(bf.readLine());
  		for(int i = 0;i<t;i++){
//	 		
  			String a = bf.readLine().trim();
  			mp.put(a, mp.get(a)+1);
  		
 		}
 		out.println("AC x " + mp.get("AC"));
 		out.println("WA x " + mp.get("WA"));
 		out.println("TLE x " + mp.get("TLE"));
 		out.println("RE x " + mp.get("RE"));
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


