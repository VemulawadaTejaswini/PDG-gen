import java.util.*;
import java.util.Map.Entry;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			double d = sc.nextDouble();
			if(d < 0) break;
			int n = (int)(d * 16.0); 
			if( (double)n != d*16.0 || (int)d > 256 ){
	            System.out.println("NA");
	            continue;
	        }
			for( int i=11; i>=0; i-- ){
				if(i == 3) System.out.print(".");
	            System.out.print(((n&(1<<i)) != 0? '1':'0'));
	        }
			System.out.println();

		}
	}
}