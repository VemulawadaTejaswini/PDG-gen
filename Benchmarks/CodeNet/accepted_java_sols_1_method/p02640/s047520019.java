import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
	
		double t = (4*X -Y)/2;
		double k = X - t;
		double ashi_k = (Y - 2 * t)/4; 
		if(t >= 0 && t == (int)t && k == (int)k && ashi_k == (int)ashi_k && k >= 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");;
		}
	}
}