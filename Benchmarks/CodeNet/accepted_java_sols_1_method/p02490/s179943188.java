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
		while (x != 0 || y != 0){
			if (x < y){
				System.out.println(x + " " + y);
			}
			else {
				System.out.println(y + " "  + x);
			}
			
			x = stdIn.nextInt();
			y = stdIn.nextInt();
		}
	}
}