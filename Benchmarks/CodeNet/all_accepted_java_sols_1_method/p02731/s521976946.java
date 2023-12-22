import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		double x = (double)L/3;
		double y = (double)L/3;
		double z = (double)L/3;
		double P = x*y*z;
		System.out.printf("%.12f",P);
		
	}
	
}
