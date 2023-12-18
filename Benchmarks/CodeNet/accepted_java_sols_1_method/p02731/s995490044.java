

import java.io.*;
import java.util.*;


public class Main
{

	public static void main(String[] args)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		Double a = sc.nextDouble();

		Double f= Math.pow(a/3, 3);
		System.out.printf("%.12f",f);
	}

}
