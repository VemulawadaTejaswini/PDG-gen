import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		Map<Integer, Integer> temp = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			String str;
			while( !(str = stdIn.nextLine()).equals("") ){
				String[] s = str.split(",");
				int[] n = new int[2];
				n[0] = Integer.parseInt(s[0]); n[1] = Integer.parseInt(s[1]);
				temp.put(n[0], ( temp.get(n[0]) == null ) ? 1 : temp.get(n[0])+1);
			}
			
			while( stdIn.hasNext() ){
				String str2 = stdIn.next();
				String[] s = str2.split(",");
				int[] n = new int[2];
				n[0] = Integer.parseInt(s[0]); n[1] = Integer.parseInt(s[1]);
				if( temp.get(n[0]) != null ){
					result.put(n[0], ( result.get(n[0]) == null ) ? temp.get(n[0])+1 :result.get(n[0])+1);
				}
			}
			for(Map.Entry<Integer, Integer> entry : result.entrySet()){
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}