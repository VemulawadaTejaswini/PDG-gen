import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		double pi = Math.PI;
		double are=x*x*pi;
		double len=2*x*pi;
		System.out.println(are+" "+len);
		
	}
}