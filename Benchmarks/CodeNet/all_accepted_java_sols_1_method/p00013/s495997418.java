
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
		int i=0;
		int[] a = new int [100];
		while((ln=input.readLine()) != null){
			
			if(Integer.parseInt(ln) ==0 ){
				i--;
				System.out.println(a[i]);
			}else{
				a[i] = Integer.parseInt(ln);
				i++;
			}
		}
	}
}