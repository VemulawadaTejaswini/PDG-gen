import java.util.*;
import java.io.*;

public class Main{
	static PrintWriter out=new PrintWriter(System.out);
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().trim().split(" ");
		
		
		String a=input[0];
		input=br.readLine().trim().split(" ");
		String b=input[0];
		
		out.println(isPossible(a,b));
		
		out.flush();
		out.close();
	}
	public static String isPossible(String a,String b)
	{
	   if(b.length()==a.length()+1){
	       for(int i=0;i<a.length();i++){
	           if(a.charAt(i)!=b.charAt(i)){
	               return "No";
	           }
	       }
	       return "Yes";
	   }
	   else{
	       return "No";
	   }
	}
}