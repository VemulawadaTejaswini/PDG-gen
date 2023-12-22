import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		String s=in.readLine();
		if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
