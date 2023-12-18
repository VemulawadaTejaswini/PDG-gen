import java.io.*;
import java.util.*;

public class Main{
	
	public static void main(String[] args){
	
	MyScanner sc = new MyScanner();
	out = new PrintWriter(new BufferedOutputStream(System.out));
	
	/**/
	
	long coordinate = sc.nextLong();
	long moves = sc.nextLong();
	long distance = sc.nextLong();
	long x;
	long temp;
	
	x = absoluteValue(coordinate) / distance;
	if(coordinate >= 0){
	coordinate = coordinate - (Math.min(x, moves) * distance);
	}else{
	coordinate = coordinate + (Math.min(x, moves) * distance);
	}
	moves = moves - x;
	
	if(absoluteValue(coordinate + distance) < absoluteValue(coordinate - distance)){
			temp = coordinate + distance;
		}else{
			temp = coordinate - distance;
		}
	
	
	for(long i = 0; i < moves; i++){
		
		if(absoluteValue(coordinate + distance) < absoluteValue(coordinate - distance)){
			coordinate = coordinate + distance;
		}else{
			coordinate = coordinate - distance;
		}
		
		
		if(absoluteValue(coordinate) > absoluteValue(temp)){
			if((moves - i) % 2 == 0){
				
				if(absoluteValue(coordinate + distance) < absoluteValue(coordinate - distance)){
				coordinate = coordinate + distance;
				}else{
				coordinate = coordinate - distance;
				}
				
			}else{
				
				
				
			}
			
			
			break;
		}
		temp = coordinate;
		
	}
	
	System.out.println(absoluteValue(coordinate));
	/**/
	 
	 out.close();	
	}
	
	public static long absoluteValue(long n){
		
		if(n > 0){
			return n;
		}else{
			return -1 * n;
		}
		
	}
	
	public static PrintWriter out;
	
	public static class MyScanner{
		
		BufferedReader br;
		StringTokenizer st;
		
		public MyScanner(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }

   }
	
}
