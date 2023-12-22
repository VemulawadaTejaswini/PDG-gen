import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp[]= br.readLine().split(" ");
        int a= Integer.parseInt(inp[0]);
        int b= Integer.parseInt(inp[1]);
        if(a<=12 && a>=6)
        	b/=2;
        else
        	if(a<=5)
        		b=0;
        System.out.print(b);
	}
}