import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		double ans = 0;
		
		double jisin = H * 30 + M * 0.5;
		double funsin = M * 6;
		
		double kakudo = jisin - funsin;
		kakudo = Math.abs(kakudo);
		
		double cos = Math.cos(kakudo);
		double C = Math.sqrt(A*A+B*B-2*A*B*cos);
		
		System.out.println(C);

	}

}