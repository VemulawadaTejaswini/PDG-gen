import java.io.*;
import java.util.*;

class Main
{

	static Scanner sc;

	public static void main( String[] args ) throws IOException
	{
		sc = new Scanner( new BufferedReader( new InputStreamReader( System.in ) ) );
	    Queue<Integer> q = new PriorityQueue<>();
	    for(int i = 0; i < 3; i++)
	        q.offer(sc.nextInt());
	    int a = q.poll(), b = q.poll(), c = q.poll();
	    System.out.printf("%d %d %d\n", a, b, c);
	}
}
