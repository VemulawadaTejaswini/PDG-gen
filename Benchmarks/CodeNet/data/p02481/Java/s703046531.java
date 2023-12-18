import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int s = a*b;
		int l = (a+b)*2;
		System.out.print(s); 
		System.out.print(" ");
		System.out.print(l);
	}
	
}