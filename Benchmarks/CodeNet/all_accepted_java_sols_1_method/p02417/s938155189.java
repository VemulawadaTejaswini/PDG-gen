import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		char ch[] = new char[1200];
		int exist[] = new int[26];
		int index;
		String str;
		
		while((str = buf.readLine()) != null){
			if(str.length() >= 1200){
				break;
			}
			
			ch = str.toCharArray();
			
			for(char c : ch){
				if(Character.isUpperCase(c)){
					index = (int)(c - 'A');
					exist[index] ++;
				}
				else if(Character.isLowerCase(c)){
					index = (int)(c - 'a');
					exist[index] ++;
				}
			}
		}
		for(int i = 0; i < 26; i++){
			char c = (char)('a' + i);
			System.out.println(c + " : " + exist[i]);
		}
	}
}