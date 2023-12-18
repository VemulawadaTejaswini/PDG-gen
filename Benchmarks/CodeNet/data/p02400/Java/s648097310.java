import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double p=Math.PI;
		int a=sc.nextInt();
		System.out.printf(a*a*p+" "+a*2*p);
	}
}