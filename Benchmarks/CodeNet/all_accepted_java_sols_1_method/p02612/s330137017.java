import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = (n%1000);
		if(a!=0)
			a=1000-a;
//		String s = sc.next();
//		int arr[] = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
		System.out.println(a);
		sc.close();

	}
}
