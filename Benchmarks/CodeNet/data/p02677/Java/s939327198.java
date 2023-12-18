import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static double[] min(int B , int M){
		double theta = M * 6.0;
		theta = theta * Math.PI / 180.0;		
		return new double[] { B * Math.cos(theta) , B * Math.sin(theta) };
	}
	static double[] hour(int A , int H , int M){
		double theta = H * 30.0;
		theta += M * 0.5;
		theta = theta * Math.PI / 180.0;
		return new double[] { A * Math.cos(theta) , A * Math.sin(theta) };
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double mp[] = min(B , M);
		double hp[] = hour(A , H , M);
		double d = Math.hypot(mp[0] - hp[0], mp[1] - hp[1]);
		System.out.println(d);
	}
}
