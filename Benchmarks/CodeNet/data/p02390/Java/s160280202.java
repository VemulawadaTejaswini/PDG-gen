import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		int hour = S / 3600;
		int a = S % 3600;
		int min = a / 60;
		int sec = a % 60;
		System.out.println(hour + ":" + min + ":" + sec);
	}
}