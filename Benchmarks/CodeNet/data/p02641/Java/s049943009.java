import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main
{
	public static void main(String args[]) throws java.lang.Exception,FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);

		// PrintStream obj = new PrintStream(new File("Output.txt"));
		// PrintStream console = System.out;
		// System.setOut(obj);

		int X = sc.nextInt();
		int N = sc.nextInt();

		int arr[] =  new int[N];

		for(int i = 0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}

		// for(int i = 0;i<N;i++)
		// 	System.out.print(arr[i] + " ");
		// System.out.println();

		ArrayList<Integer>ar = new ArrayList<Integer>();

		for(int i = 1;i<=100;i++)
		{
			boolean test = false;

			for(int element : arr)
			{
				if(element == i)
				{
					test = true;
					break;
				}
			}

			if(test != true)
			{
				ar.add(i);
			}
		}

		ArrayList<Integer>diff = new ArrayList<Integer>();

		int ar_size = ar.size();

		// for(int i = 0;i<ar_size;i++)
		// 	System.out.print(ar.get(i) + " ");
		// System.out.println();

		for(int i = 0;i<ar_size;i++)
		{
			int d = Math.abs(X - ar.get(i));

			diff.add(d);
		}

		int min = Integer.MAX_VALUE;

		int index = 0;

		int diff_size = diff.size();

		for(int i = 0;i<diff_size;i++)
		{
			int e = diff.get(i);

			if(e < min)
			{
				min = e;
				index = i;
			}
		}

		System.out.println(ar.get(index));

		System.out.flush();
	}
}