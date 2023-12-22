import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int happy = 0;
		boolean b = false;
		
		if(X/500>=1){
			happy = X/500*1000;
			X -= X/500*500;
		}
		if(X/5>=1) happy += X/5*5;
		
		System.out.print(happy);
	}
}