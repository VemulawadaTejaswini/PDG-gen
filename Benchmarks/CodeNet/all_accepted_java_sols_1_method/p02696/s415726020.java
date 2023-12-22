import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long N = sc.nextLong();

		Long max = (long) 0;

		Long z = (Long)(A*N/B)-A*(Long)(N/B);
		if(z >= max) {
			max = z;
		}

		Long x = B-1;
		if(x <= N) {
			z = (Long)(A*x/B)-A*(Long)(x/B);
			if(z >= max) {
				max = z;
			}
		}

		System.out.println(max);
	}

}

