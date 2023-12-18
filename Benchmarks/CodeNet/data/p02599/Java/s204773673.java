import java.io.*;
import java.math.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i=0; i<n; i++)
		{
		    arr.add(in.nextInt());
		}
		for (int i=0; i<q; i++)
		{
		    int a = in.nextInt()-1;
		    int b = in.nextInt()-1;
		    HashSet<Integer> set = new HashSet<>();
		    for (int j=a; j<=b; j++)
		    {
		        set.add(arr.get(j));
		    }
		    System.out.println(set.size());
		}
	}
}