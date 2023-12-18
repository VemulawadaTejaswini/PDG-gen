import java.io.*;
import java.lang.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		char ch[] = line.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(Character.isUpperCase(ch[i])) System.out.print(Character.toLowerCase(ch[i]));
			else if(Character.isLowerCase(ch[i])) System.out.print(Character.toUpperCase(ch[i]));
			else System.out.print(ch[i]);
		}
		System.out.println();
	}
}