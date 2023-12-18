import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		TreeMap<String,ArrayList<Integer>> tm=new TreeMap<String,ArrayList<Integer>>(); 
		ArrayList<String> AL=new ArrayList<String>();

		while(in.hasNext())
		{
			String st=in.next();
			int n=in.nextInt();
			if(tm.containsKey(st))
			{
				tm.get(st).add(n);
				Collections.sort(tm.get(st));
			}
			else
			{
				AL.add(st);
				ArrayList<Integer>al=new ArrayList<Integer>();
				al.add(n);
				tm.put(st, al);
				Collections.sort(tm.get(st));
			}
		}
		Collections.sort(AL);
		for(int i=0;i<AL.size();i++)
		{
			System.out.println(AL.get(i));
			ArrayList AL2=tm.get(AL.get(i));
			for(int j=0;j<AL2.size()-1;j++)
				System.out.print(AL2.get(j)+" ");
			System.out.println(AL2.get(AL2.size()-1));
		}
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}