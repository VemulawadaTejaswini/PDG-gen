import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//a個口の電源タップ
		int b = sc.nextInt();//b個以上の差込口
		int n = (int) Math.ceil((double) (b - 1) / (a - 1));//電源タップの個数
		System.out.println(n);
	}
}
