import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		System.out.printf("%f %f\n",num1 * num1 * Math.PI,2 * Math.PI * num1);
		sc.close();
	}	
}
