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
		int ways = 0;
		if (x==W/2&&y==H/2) ways++; //Center of rectangle allows for several lines that divide
		//rectangle into two equal pieces
		System.out.println(A+" "+ways);
	}
}