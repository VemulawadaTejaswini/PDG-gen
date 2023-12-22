import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String ln ="";
		int a,y;
		while((ln=input.readLine()) != null){
			int count=0;	
			a = Integer.parseInt(ln);
			
			for (int i=a; i < 600; i+= a){
				y=i*i;
				count += y*a;
			}
			System.out.println(count);
		}
	}
}