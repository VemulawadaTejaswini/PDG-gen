
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    private static BufferedReader br;
	public static void main (String[] args) throws java.lang.Exception
	{
		br=  new BufferedReader(new InputStreamReader(System.in));
		char alpha = br.readLine().charAt(0);
		if(alpha >= 'a' && alpha <= 'z')
		    System.out.println("a");
		else
		    System.out.println("A");
	}
}
