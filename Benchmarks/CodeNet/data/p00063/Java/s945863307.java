import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int count = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				StringBuilder sb = new StringBuilder(str);
				sb.reverse();
				if( str.contentEquals(sb) ){
					count++;
				}
			}
			System.out.println(count);
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}