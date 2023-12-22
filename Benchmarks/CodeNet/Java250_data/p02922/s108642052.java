import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		int cnt = 0;
		int sum = 0;
		if(B == 1) {
			System.out.println(0);
			return;
		}else {
			sum += A;
			cnt++;
			if(sum >= B) {
				System.out.println(1);
				return;
			}
			while(sum < B) {
				sum  = (sum - 1) + A;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}