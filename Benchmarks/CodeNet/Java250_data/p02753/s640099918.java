import java.io.*;
import java.util.*;
//import javafx.util.Pair;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String []s=br.readLine().split(" ");
		//int N = Integer.parseInt(s[0]);
		//int M = Integer.parseInt(s[1]);
		
		int arr[]=new int[2];	
		
		char ch[]=br.readLine().toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A')
				arr[0]++;
			else
				arr[1]++;
		}	

		if(arr[0]>0 && arr[1]>0)
			out.println("Yes");
		else
			out.println("No");
		
		
	}
	
	
}


