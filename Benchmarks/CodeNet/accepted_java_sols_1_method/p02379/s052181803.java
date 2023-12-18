import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		Scanner sc = new Scanner(System.in);
		Double x1 = sc.nextDouble();
		Double y1 = sc.nextDouble();
		Double x2 = sc.nextDouble();
		Double y2 = sc.nextDouble();
		Double xl = x2 - x1;
		Double yl = y2 - y1;
		Double length = Math.sqrt( xl*xl + yl*yl);
		System.out.printf("%.5f",length);
	}
}