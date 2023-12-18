import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Main{
	public static void main(String [] args)throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))
		  count++;
}
System.out.println(count);
}
}
