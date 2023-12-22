import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int price;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		price = Integer.parseInt(br.readLine());
		System.out.println(price * price * price);
	}
}