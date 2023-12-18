import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int x, y;
		
		x = stdIn.nextInt();
		y = stdIn.nextInt();
		
		if (x > y){
			int tmp = x;
			x = y;
			y = tmp;
		}
		System.out.println(x + " " + y);
	}
}