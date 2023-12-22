import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if((n/100)*5>=n%100)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
	