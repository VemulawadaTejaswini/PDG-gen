import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double A = in.nextDouble();
      	double B = in.nextDouble();
		double answer = A*B;
		System.out.println((long)answer);
	}
}