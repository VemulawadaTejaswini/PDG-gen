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
		String []s=br.readLine().split(" ");
		
		int X=Integer.parseInt(s[0]);
		int Y=Integer.parseInt(s[1]);
		int Z=Integer.parseInt(s[2]);
		
		out.println(Z+" "+X+" "+Y);
		
		
	}
	
	
}


