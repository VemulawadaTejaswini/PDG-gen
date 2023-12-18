import java.util.*;
public class Main {
	public static void main(String[] args){
		double D = sc.nextDouble();
		double T = sc.nextDouble();
		double S = sc.nextDouble();
		
		double a = 0;
		a = D / S;
		
		if(a <= T) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}