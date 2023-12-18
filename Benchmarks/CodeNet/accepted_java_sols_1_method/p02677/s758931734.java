import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		
		int A = scr.nextInt();
		int B = scr.nextInt();
		int H = scr.nextInt();
		int M = scr.nextInt();
		
		double H1 = (H*60+M)*0.5;
		double M1 = M*6;
		
		double KK;
		
		if(H1 < M1) {
			KK = M1-H1;
		}else {
			KK = H1-M1;
		}
		
		double Theta = Math.cos(Math.toRadians(KK));
		
		double ans = A*A+B*B-2*B*A*Theta;
		
		System.out.println(Math.sqrt(ans));
		
	}
}