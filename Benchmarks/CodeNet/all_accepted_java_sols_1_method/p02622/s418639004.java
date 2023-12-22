import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine(),t=br.readLine();
		int c=0;
		for(int i=0; i<s.length(); i++) if(s.charAt(i)!=t.charAt(i)) ++c;
		System.out.println(c);
	}
}