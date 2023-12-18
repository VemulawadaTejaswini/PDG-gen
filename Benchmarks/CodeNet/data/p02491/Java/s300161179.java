import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double f;
		
		f=(float)a/b;
		int d = a/b;
		int r = a%b;
		
		System.out.printf(d + " " + r + " " + "%f",f);
	}
}