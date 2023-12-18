import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double S=r*r*Math.PI;
		double T=2*r*Math.PI;
		System.out.println(S+" "+T);
	}	
}