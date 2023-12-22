import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		double W = input.nextDouble();
		double H = input.nextDouble();
		double x = input.nextDouble();
		double y = input.nextDouble();
		double A = W*H;
		A/=2; //It's always possible to split rectangle into 2 equal pieces
		//when divider can have any slope and start point
		x%=W;
		y%=H; //Easier to check if point is on edge
		int ways = 0;
		boolean Vert = false;
		boolean Hor = false;
		if (x==W/2) Vert=true;
		if (y==H/2) Hor=true;
		if (Vert&&Hor) ways++;
		
		System.out.println(A+" "+ways);
	}
}