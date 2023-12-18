import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) throws java.lang.Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		System.out.println(s.charAt(s.length()-1)=='s'?s+"es":s+"s");
	}

}
