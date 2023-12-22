import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		String[] lo = reader.readLine().split(" ");
		int X = Integer.parseInt(lo[0]);		
		int Y = Integer.parseInt(lo[1]);
		if((Y-2*X)%2==0 && (Y-2*X)>=0 && (Y-2*X)/2 <= X){
			System.out.println("Yes");
		}
		else System.out.println("No");	
	}
}
