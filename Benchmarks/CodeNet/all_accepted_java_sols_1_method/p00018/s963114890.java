
import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		String[] ln;
		line=input.readLine();
		ln=line.split(" ");
		int[] b =new int[5];
		for (int i=0; i < 5;i++){
			b[i]=Integer.valueOf(ln[i]);
		}
		Arrays.sort(b);
		for(int i=0;i<4;i++){
			System.out.print(b[4-i] + " ");
		}	
		System.out.println(b[0]);
			
	}
}	
		