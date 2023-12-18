import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble(),S=0,L=0;
		S=r*r*Math.PI;
		L=2*r*Math.PI;
		System.out.println(String.format("%.6f", S)+" "+String.format("%.6f", L));
	}
}
