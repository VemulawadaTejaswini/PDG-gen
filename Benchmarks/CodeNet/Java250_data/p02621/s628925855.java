import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		System.out.println(a+a*a+a*a*a);
	}
}