import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		
		System.out.printf("%.5f %.5f\n",Math.PI * r * r, 2 * Math.PI * r);
		
	}

}

