import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
	
		double a = (4*X -Y)/2;
		double kame = X -a;
		double ashi_kame = (Y - 2 * a)/4; 
		if(a >= 0 && a == (int)a && kame == (int)kame && ashi_kame == (int)ashi_kame) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");;
		}
	}
}
