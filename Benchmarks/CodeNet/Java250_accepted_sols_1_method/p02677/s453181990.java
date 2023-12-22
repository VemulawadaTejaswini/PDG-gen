import java.util.Scanner;
import java.lang.Math;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
      		int B = sc.nextInt();
      		int H = sc.nextInt();
      		int M = sc.nextInt();
      		double rad = Math.abs(H*30 + M*0.5 - M*6);
      		if(rad >= 180){
            rad = 360 - rad;
            }
      		double C = 0;
      		
      		C  =  Math.pow(A,2)+Math.pow(B,2) - 2*A*B*Math.cos(Math.toRadians(rad));
      
		System.out.println(Math.pow(C,0.5));
	}
 
}