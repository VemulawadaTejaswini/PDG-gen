import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			String ln;
			char[] a =line.toCharArray();
			char[] b =new char[5];
			for (int i=0; i <= 4;i++){
				b[i]=a[2*i];
			}
			Arrays.sort(b);
			for(int i=0;i<4;i++){
				System.out.print(b[4-i]+" ");
			}	
			System.out.print(b[0]);
			
		}	
	}
}	
		