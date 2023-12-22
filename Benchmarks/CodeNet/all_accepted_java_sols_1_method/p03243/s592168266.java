import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = N / 111;
		if (N % 111 != 0) {
			num++;
		}
		System.out.println(num * 111);
	}
}
