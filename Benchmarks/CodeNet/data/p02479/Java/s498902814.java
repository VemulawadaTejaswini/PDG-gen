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
		
		round = r * 2 * 3.141592653589;
		S = r * r * 3.141592653589;
		System.out.println(S + " " + r);
	}
}