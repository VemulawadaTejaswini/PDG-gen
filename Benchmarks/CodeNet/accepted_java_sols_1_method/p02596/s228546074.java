import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long now = 7;
		int count =1;
		while (now%K!=0 &&count <=K) {
			count ++;
			now = (now *10+7)%K;
		}
		if (count <=K) {
			System.out.println(count);
			return ;
		}
		System.out.println(-1);
	}
}
