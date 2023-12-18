import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		double A = in.nextDouble();
		double B = in.nextDouble();
		
		double C = Math.abs((A+B)/2);
		if(C==(int)C) {
			System.out.println((int)C);
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
