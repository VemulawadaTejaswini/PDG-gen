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
		String arr[] = new String[n];
		for(int i=0;i<n;i++) {
			arr[i]  =sc.next();
		}
		HashMap<String, Integer> map = new HashMap<String, Integer> ();
		map.put("AC", 0);map.put("WA", 0);map.put("TLE", 0);map.put("RE", 0);
		for(int i=0;i<n;i++) {
			map.put(arr[i], map.get(arr[i])+1);
		}
		System.out.println("AC x "+map.get("AC"));
		System.out.println("WA x "+map.get("WA"));
		System.out.println("TLE x "+map.get("TLE"));
		System.out.println("RE x "+map.get("RE"));
		sc.close();

	}
}
