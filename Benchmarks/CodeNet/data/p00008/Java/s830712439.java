
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] arg)throws IOException //??\????????§??????
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));//??°?????????????????????
		String st = input.readLine();
		int sum = Integer.parseInt(st);
		int count=0;
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