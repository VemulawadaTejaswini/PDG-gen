import java.io.*;
import java.util.*;

class Main
{

	static Scanner sc;

	public static void main( String[] args ) throws IOException
	{
		sc = new Scanner( new BufferedReader( new InputStreamReader( System.in ) ) );
        while(true)
        {
            int a = sc.nextInt(), b = sc.nextInt();
            if(a == 0 && b == 0) return;
            if(a < b) System.out.printf("%d %d\n", a, b);
            else System.out.printf("%d %d\n", b, a);
        }
	}
}


