import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		Long n = in.nextLong();
        Long ans=n*(n-1)/2;
		System.out.println(ans);
	}
}
	