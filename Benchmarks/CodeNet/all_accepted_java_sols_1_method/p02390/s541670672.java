import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = S / 3600;
		int m = (S - 3600 * h) / 60;
		int s = S % 60;
		System.out.println(h+":"+m+":"+s);
	}
}