import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int d = a / b;
		int r = a & b;
		float f = (float)d;

        System.out.printf("%d???%d %.5f\n", d , r, f);
     
	}
}