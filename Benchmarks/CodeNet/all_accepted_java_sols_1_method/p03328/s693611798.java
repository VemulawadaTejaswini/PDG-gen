import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int diff=b-a;
		int height = diff*(diff-1)/2 - a;
		System.out.println(height);
	}
}
