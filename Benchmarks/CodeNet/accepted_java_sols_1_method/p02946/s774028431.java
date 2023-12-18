import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int k=in.nextInt();
		int x=in.nextInt();
		for(int i=-k+1;i<k;i++)
		{
			System.out.print(x+i+" ");
		}
			
	}
}
	