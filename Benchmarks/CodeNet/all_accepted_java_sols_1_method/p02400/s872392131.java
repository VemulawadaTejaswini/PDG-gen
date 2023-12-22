import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		
		System.out.printf("%f %f%n",r*r*Math.PI,2.0*r*Math.PI);
	}

}

