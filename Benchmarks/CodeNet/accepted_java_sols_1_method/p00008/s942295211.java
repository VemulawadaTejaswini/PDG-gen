
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] arg)throws IOException 
	{
		String ln ="";
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		while((ln=input.readLine()) != null){
			int count=0;
			int sum = Integer.parseInt(ln);
			for (int a=0; a < 10;a++){
				for (int b=0; b < 10;b++){
					for (int c=0; c < 10;c++){
						for (int d=0; d < 10;d++){
							if (a+b+c+d==sum){
								count+=1;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}