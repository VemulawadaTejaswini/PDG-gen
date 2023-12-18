import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();

		int sum = 0;
		int totalMinute = 0;

		while(N > sum)
		{
			sum += X;
			totalMinute += T;
		}

		System.out.println(totalMinute);
	}

}
