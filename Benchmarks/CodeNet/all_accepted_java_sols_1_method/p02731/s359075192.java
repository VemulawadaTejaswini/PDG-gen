import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		/*
		 let a, b, and c represent the side lengths
		 a + b + c = L
		 volume = a*b*c
		 according to the AM-GM inequality:
		 (a*b*c)^(1/3) <= (a+b+c)/3
		 (a*b*c)^(1/3) <= L/3
		 a*b*c <= (L/3)^3
		 */
		System.out.printf("%.15f\n", ((double)L*L*L)/27.0);
	}
}
