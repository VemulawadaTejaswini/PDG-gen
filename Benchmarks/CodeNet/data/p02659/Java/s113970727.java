import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		Double ans = A*B;
		
		System.out.println(ans.longValue());
		
		in.close();
	}
}
