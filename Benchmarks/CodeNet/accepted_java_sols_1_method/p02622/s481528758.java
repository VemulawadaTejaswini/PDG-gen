import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine().trim();
		String s2=br.readLine().trim();
		int count=0;
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)!=s2.charAt(i))
				count++;
		System.out.println(count);
	}

}
