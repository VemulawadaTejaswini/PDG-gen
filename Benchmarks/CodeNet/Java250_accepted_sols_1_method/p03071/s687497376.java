import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int big = Math.max(a, b);
		int small = Math.min(a,b);
		sum += big;
		big--;
		sum += Math.max(big,small);
		System.out.println(sum);
	}
}