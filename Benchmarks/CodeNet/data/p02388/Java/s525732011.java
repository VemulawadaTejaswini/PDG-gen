import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String args[]){
		int x=0,y=0;
		//System.out.println("Please input x:");
		sc = new Scanner(System.in);
		x=sc.nextInt();
		y=x*x*x;
		System.out.println(y);
	}
}
