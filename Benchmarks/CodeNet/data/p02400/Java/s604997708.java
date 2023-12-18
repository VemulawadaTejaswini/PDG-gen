import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double r = in.nextDouble();
		
		System.out.print(r*r*Math.PI);
		System.out.print(" ");
		System.out.println(2*Math.PI*r);
		System.out.println();
	}
}