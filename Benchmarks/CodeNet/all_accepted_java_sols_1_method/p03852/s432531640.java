import java.util.*;
import java.io.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		if(s.matches("a|e|i|o|u")){
			System.out.println("vowel");
		}else{
			System.out.println("consonant");
		}
	}
}