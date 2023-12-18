import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double radB = M * 6.0;
		double radA = 30.0 * H + 30.0 * (radB / 360.0);
		double rad;
		if(Math.abs(radA - radB) > 180){
			rad = 360 - Math.abs(radA - radB);
		}else{
			rad = Math.abs(radA - radB);
			}
		double C = Math.PI * (rad / 180);
		double ans = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(C));
		System.out.println(ans);
	}
}