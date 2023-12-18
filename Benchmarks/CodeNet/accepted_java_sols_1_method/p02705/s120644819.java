import java.lang.Math;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R;
		double circumference;
		R = sc.nextDouble();
		
		circumference = 2*R*(Math.PI);
		
		System.out.println(circumference);

	}

}