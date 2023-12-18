import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		long N= Long.parseLong(reader.readLine());
		String res = "";
		while(N>0){
			N--;
			res =  (char)('a'+ N%26)+ res;
			N/=26;			
		}
		System.out.println(res);
	}
	private static String getCharForNumber(int i) {
    	char[] alphabet = "zabcdefghijklmnopqrstuvwxyz".toCharArray();
    	return Character.toString(alphabet[i]);
	}
}
