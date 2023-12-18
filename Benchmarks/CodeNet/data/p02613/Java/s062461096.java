import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;
public class Main
{   
static class FastReader 	
{		
BufferedReader br; 		
StringTokenizer st; 		
public FastReader() 		
{ 			
br = new BufferedReader(new	InputStreamReader(System.in)); 		
} 		
String next() 		
{ 			
while (st == null || !st.hasMoreElements()) 			
{ 				
try				
{ 					
st = new StringTokenizer(br.readLine()); 				
} 				
catch (IOException e) 				
{ 					
e.printStackTrace(); 				
} 			
} 			
return st.nextToken(); 		
} 
		
int nextInt() 		
{ 			
return Integer.parseInt(next()); 		
} 
		
long nextLong() 		
{ 			
return Long.parseLong(next()); 		
} 
		
double nextDouble() 		
{ 			
return Double.parseDouble(next()); 		
		 } 
		
		String nextLine() 		
		 { 			
String str = ""; 			
			 try			
			{ 				
				 str = br.readLine(); 			
			 } 			
			 catch (IOException e) 			
			 { 				
				 e.printStackTrace(); 			
			 } 			
			 return str; 		
		 } 	
	 }
	
	 public static void main(String[] args){
		 FastReader scan=new FastReader();
		  int t = scan.nextInt();
		  HashMap<String,Integer> map = new HashMap<>();
		  for(int i=0;i<t;i++){
				String s = scan.next();
					if(map.containsKey(s))map.put(s,map.get(s)+1);
					else map.put(s,1);
			}
		if(map.containsKey("AC"))System.out.println("AC x " + map.get("AC"));
		else System.out.println("AC x " + 0);
		if(map.containsKey("WA"))System.out.println("WA x " + map.get("WA"));
		else System.out.println("WA x " + 0);
		if(map.containsKey("TLE"))System.out.println("TLE x " + map.get("TLE"));
		else System.out.println("TLE x " + 0);
		if(map.containsKey("RE"))System.out.println("RE x " + map.get("RE"));
		else System.out.println("RE x " + 0);
		
	} 
} 
