import java.io.*;
import java.util.*;

class AOJ10018{
    public static void main(String[] args) throws IOException{
	BufferedReader input =
	    new BufferedReader(new InputStreamReader(System.in));
	String str = input.readLine();

	for(int i = 0 ; i < str.length() ; i++){
	    char s = str.charAt(i);
	    if('a' <= s && s <= 'z') System.out.print(Character.toUpperCase(s));
	    else if('A' <= s && s <= 'Z') System.out.print(Character.toLowerCase(s));
	    else System.out.print(s);
	}
	System.out.println();
    }
}