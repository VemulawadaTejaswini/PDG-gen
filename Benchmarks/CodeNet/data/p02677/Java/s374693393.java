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
		if(H>0) {
			Hr=30*H;
		}
		if(M>0) {
			Mr=M*6;
			tmp=M/2;
			Hr = Hr + tmp;
		}
		if(Hr>Mr) {
			R=Hr-Mr;
		}else {
			R=Mr-Hr;
		}
		if(R>180) {
			R=R-180;
		}
		result = Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-(2*A*B*Math.cos(Math.toRadians(R))));
		System.out.println(result);
	}
}