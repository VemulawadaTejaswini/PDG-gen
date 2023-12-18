import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		char ch[] = new char[1200];
		int exist[] = new int[26];
		int index;
		
		String str = buf.readLine();
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
		
		for(int i = 0; i < 26; i++){
			StringBuilder sb = new StringBuilder();
			sb.append((char)('a' + i));
			sb.append(" : ");
			sb.append(exist[i]);
			System.out.println(new String(sb));
		}
	}
}