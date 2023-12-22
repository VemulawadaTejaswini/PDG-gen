import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuffer line = new StringBuffer(br.readLine());
		
		System.out.println(line.reverse().toString());
	}
}