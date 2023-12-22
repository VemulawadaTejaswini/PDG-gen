import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 地点数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = c - (a - b);
		
		if (result < 0) result = 0;
		
		System.out.println(result);


	}}