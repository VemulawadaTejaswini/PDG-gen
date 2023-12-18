import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			double r = s.nextDouble();
			double PI = 3.1415926;
			System.out.printf("%.5f %.5f",PI*r*r,2*PI*r);
		}
	}
}