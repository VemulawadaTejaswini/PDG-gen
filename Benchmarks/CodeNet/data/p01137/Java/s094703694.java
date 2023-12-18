import java.io.*;
import java.util.*;

public class Main{ 
	public static void main(String args[]) throws IOException{
		Scanner scr = new Scanner(System.in);
		while (true){
		    try{
				int n = Integer.parseInt(scr.nextLine());
				if (n==0) break; //??\?????????
				System.out.println( SearchGrab(n) );
			}catch(Exception e){
				System.err.println("Exception");
				break;
			}
        }
		scr.close();
	}
	
	
	private static int SearchGrab(int n){
		int m = Integer.MAX_VALUE;
		for(int z=0; z*z*z<=n; z++){
			int z3 = z*z*z;
			for(int y=0; y*y<=n-z3; y++){
				int x = n - z3 - y*y;
				if(x+y+z<m) m=x+y+z;				
			}
		}
		return m;
	}
}