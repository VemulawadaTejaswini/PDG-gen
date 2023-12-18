
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a < b)
		{
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else
			System.out.println("a == b");
	}
}