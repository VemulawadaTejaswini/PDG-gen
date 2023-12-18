import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		for(int i= 1; ; i++) {
			s=r.readLine();
			int x = Integer.parseInt(s);
			if( x==0 )
			break;
	
	System.out.println("Case "+i+": "+x);
		}
	}
}