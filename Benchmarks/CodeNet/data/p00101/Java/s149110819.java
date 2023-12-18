import java.io.*;
import java.util.*;

public class Main {
	static boolean check( String s ) {
		if ( s.equals("Hoshino") ) return true;
		else return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader din = new BufferedReader( new InputStreamReader(System.in));
		int n = Integer.parseInt(din.readLine());
		for ( int i = 0; i < n; i++ ) {
			String str = din.readLine();
			String tmp = "" , all = "";
			for ( int j = 0; j < str.length(); j++ ) {
				char c = str.charAt(j);
				if ( c != ' ' )
					tmp += c;
				if ( check(tmp) == true )
					tmp = "Hoshina";				
				else if ( c == ' ' ) {
					all += tmp+c;
					tmp = "";
				}
			}
			all += tmp;
			System.out.println(all);
		}
	}
}