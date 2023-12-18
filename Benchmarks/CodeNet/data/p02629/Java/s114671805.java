import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		long N= Long.parseLong(reader.readLine());
		String res = "";
		while(N>0){
			long p = N%26;
			if(p==0) p= 26;
			N/=26;
			res = getCharForNumber((int)(p)) +res;			
		}
		System.out.println(res);
	}
	private static String getCharForNumber(int i) {
    	char[] alphabet = "&abcdefghijklmnopqrstuvwxyz".toCharArray();
    	return Character.toString(alphabet[i]);
	}
}
