import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>list = new ArrayList<>();
		for(int i = 0;i<n;i++){
			int a = sc.nextInt();
			list.add(a);
		}Collections.sort(list);
		int al =0;
		int bo = 0;
		for(int i =0;i<n;i++){
			al+=(i+1)%2*list.get(n-1-i);
			bo+=(i)%2*list.get(n-1-i);
		}System.out.println(al-bo);
	}
}