import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = 3.141592654;
		double area = r*r*pi;
		double length = (r+r)*pi;
		System.out.println(area+" "+length);
	}
}