import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		if(n>=400 && n<=599) System.out.println(8);	
		else if(n>599 && n<=799) System.out.println(7);
		else if(n>799 && n<=999) System.out.println(6);
		else if(n>999 && n<=1199) System.out.println(5);
		else if(n>1199 && n<=1399) System.out.println(4);
		else if(n>1399 && n<=1599) System.out.println(3);
		else if(n>1599 && n<=1799) System.out.println(2);
		else if(n>1799 && n<=1999) System.out.println(1);
	}
}
