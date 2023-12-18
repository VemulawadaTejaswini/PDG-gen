import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		double x=stdIn.nextDouble();
		System.out.printf("%f %f\n",(x*x*Math.PI),(2*x*Math.PI));
	}
}