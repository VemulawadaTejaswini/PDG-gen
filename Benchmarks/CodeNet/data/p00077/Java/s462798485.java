import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		List<String> list = new ArrayList<String>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				StringBuilder ans = new StringBuilder();
				for(int i = 0; i < str.length(); i++){
					if( str.charAt(i) == '@' ){
						int x = Integer.parseInt(Character.toString(str.charAt(i+1)));
						while( x-- > 0 ){
							ans.append(Character.toString(str.charAt(i+2)));
						}
						i += 2;
					} else {
						ans.append(Character.toString(str.charAt(i)));
					}
				}
				list.add(ans.toString());
			}
			
			for(String s : list){
				System.out.println(s);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}