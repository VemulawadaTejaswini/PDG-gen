import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//String[] ia;
		String is;
		//Scanner in = new Scanner(System.in);

		int[] count = new int[26];
		while((is = in.readLine()) != null){
			for(int i = 0;i < is.length(); ++i){
				char tmp = is.charAt(i);
				if('a' <= tmp && tmp <= 'z'){
					++count[(int)(tmp-'a')];
				} else if('A' <= tmp && tmp <= 'Z'){
					++count[(int)(tmp-'A')];
				}
			}
		}
		for(int i = 0;i < 26; ++i){
			System.out.println("" + ((char)(i+'a')) + " : " + count[i]);
		}
	}
}