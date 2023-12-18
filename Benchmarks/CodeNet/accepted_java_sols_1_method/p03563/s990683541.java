import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//A
		int a = sc.nextInt();//前回の記録
		int b = sc.nextInt();//目標
		System.out.println(2*b-a);
	}
}
