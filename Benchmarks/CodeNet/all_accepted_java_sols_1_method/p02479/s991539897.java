import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double r;
		double round, S;
		
		r = stdIn.nextDouble();
		
		S = r * r * 3.141592653589;
		round = r * 2 * 3.141592653589;
		System.out.println(String.format("%1$1f %2$1f", S, round));
	}
}