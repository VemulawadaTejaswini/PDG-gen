import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		char now = 'A';
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				if( str.charAt(0) == now ){
					now = str.charAt(2);
				} else if( str.charAt(2) == now ){
					now = str.charAt(0);
				}
			}
			System.out.println(now);
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}