import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		long sum=0;
		for(int i=0; i<s.length(); i++) sum+=s.charAt(i)-48;
		System.out.println(sum%9==0?"Yes":"No");
	}

}