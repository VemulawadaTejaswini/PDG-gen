import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int d = a / b;
		int r = a % b;
		double f = a / (b * 1.00000); 
		System.out.println(d +" "+ r + " " + f);
	}
}