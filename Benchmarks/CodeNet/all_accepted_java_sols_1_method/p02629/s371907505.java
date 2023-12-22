import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		long n = Long.parseLong(bf.readLine());
 		long prod = 26;
 		int count = 1;
 		while(n-prod > 0){
 			n-=prod;
 			prod*=26;
 			count++;	
 		}
 		n-=1;
 		String a = Long.toString(n, 26);
 		int len = a.length();
 		StringJoiner sj1 = new StringJoiner("");
 		StringJoiner sj = new StringJoiner("");
 		for(int i = 0;i<count-a.length();i++){
 			sj.add("0");
 		}
 		sj1.add(sj.toString());
 		sj1.add(a);
 		
 		String c = sj1.toString();
 		StringJoiner ans = new StringJoiner("");
 		for(int i = 0;i<c.length();i++){
 			if (Character.isDigit(c.charAt(i))){
 				ans.add((char)(Integer.parseInt(c.charAt(i)+ "") + 97)+"");
 			}
 			else{
 				ans.add((char)((int)(c.charAt(i))+10)+"");
 			}
 		}
 		
 		out.println(ans.toString());
 		out.close();
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


