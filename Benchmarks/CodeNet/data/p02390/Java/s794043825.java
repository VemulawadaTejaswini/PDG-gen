package aizu;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int e, f, g, h;
		
		e=a/3600;
		f=a%3600;
		g=f/60;
		h=f%60;
		
		System.out.println(""+e+":"+g+":"+h+"");
		sc.close();

	}

}