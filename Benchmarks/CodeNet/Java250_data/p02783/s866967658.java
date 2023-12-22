import java.util.Scanner;
import static java.lang.Math.ceil;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println((int)ceil((1.0*a)/(1.0*b)));
	}
}