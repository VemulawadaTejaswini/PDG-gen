import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		
		int xi = sc.nextInt();
		int yi = sc.nextInt();
		double f = (float) xi/yi;
		System.out.printf(xi / yi + " " + xi % yi + " " + "%5f",f);
	}
	public static void main(String[] args){
		new Main().run();
	}
}