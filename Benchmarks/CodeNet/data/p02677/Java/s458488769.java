import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		double Hr = 0;
		double Mr = 0;
		double R = 0;
		double result = 0;
		double tmp = 0;
      
      double ang = (H*60+M)*360/(12*60)-m*360/60;
      if(ang>180){
        ang=360-ang;
      }
      
		result = A*A+B*B-(2*A*B*Math.cos(Math.toRadians(ang)));
		result = Math.sqrt(result);
		System.out.println(result);
      
	}
}
