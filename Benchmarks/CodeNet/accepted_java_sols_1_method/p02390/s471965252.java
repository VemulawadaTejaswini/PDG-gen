
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h, m, s;
		s = S;
		h = s / 3600;
		s -= 3600 * h;
		m = s / 60;
		s -= 60 * m;
		System.out.println(h + ":" + m + ":" + s);
		
	}
}