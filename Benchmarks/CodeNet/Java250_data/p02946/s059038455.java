import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int x = in.nextInt();
		
		int min = -1000000;
		int max = 1000000;

		for (int i = Math.max(x - k  + 1, min); i <= Math.min(x + k - 1, max); ++i)
			System.out.print(i + " ");
		System.out.println();
	}
}