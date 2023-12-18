
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		double l = 100*(n-m)+1900*m;
		double k = 1/Math.pow(2, m);
		//double x = l*k/((1-k)*(1-k));
		double x = l/k;
		System.out.println((int)x);
	}

}
