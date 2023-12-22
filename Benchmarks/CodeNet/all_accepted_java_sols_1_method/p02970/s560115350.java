import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		System.out.println((n-1)/(2*d+1)+1);
	}
}
	