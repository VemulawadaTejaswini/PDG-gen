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
				for(int i = 0; i < str.length(); i++){
					if( Character.isDigit(str.charAt(i)) ){
						int start = i;
						int end = i;
						while( end < str.length() && Character.isDigit(str.charAt(end)) ){
							end++;
						}
						int x = Integer.parseInt(str.substring(start, end));
						count += x;
						i = end;
					}
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