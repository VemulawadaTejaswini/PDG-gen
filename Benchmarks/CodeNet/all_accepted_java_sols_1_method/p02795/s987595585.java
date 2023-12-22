import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();

		int num = 0;
		if(H > W)
			num = H;
		else
			num = W;

		int sum = 0;
		int cnt = 0;
		while(sum < N) {
			sum +=num;
			cnt++;			
		}

		System.out.println(cnt);
	}
}