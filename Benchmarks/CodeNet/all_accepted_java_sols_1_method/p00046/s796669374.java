import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		double max;
		double min;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
				double first = stdIn.nextDouble();
				max = first;
				min = first;
			while( stdIn.hasNext() ){
				double x = stdIn.nextDouble();
				if( x > max ){
					max = x;
				}
				if( x < min ){
					min = x;
				}
			}
			System.out.println(max-min);
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}