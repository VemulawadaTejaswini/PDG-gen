import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = Math.PI;
		double area = r*r*pi;
		double length = 2*r*pi;
		System.out.printf("%f %f",area,length);
	}
}