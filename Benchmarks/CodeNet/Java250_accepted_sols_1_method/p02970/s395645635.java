import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double N = sc.nextInt(),D = sc.nextInt();
		System.out.print((int)(Math.ceil(N/(D*2+1))));

	}
}