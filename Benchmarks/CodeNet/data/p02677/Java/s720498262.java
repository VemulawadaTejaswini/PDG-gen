import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		double jisin = (double)H * 30 + (double)M * 0.5;
		double funsin = (double)M * 6;
		
		double kakudo = jisin - funsin;
		if(kakudo == 0) {
			System.out.println(0);
			System.exit(0);
		}else if(kakudo == 180) {
			System.out.println(A + B);
			System.exit(0);
		}else if(kakudo > 180){
			kakudo = kakudo - 180;
		}
		kakudo = Math.abs(kakudo);
		
		double cos = Math.cos(kakudo * Math.PI / 180);
		double C = Math.sqrt(A*A+B*B-2*A*B*cos);
		
		System.out.println(C);

	}

}

