import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();

		int ans = 0;
		for(int i = 0; i < Math.pow(10, 9); i++) {
			double check = Math.pow(K, i);
			int num = (int) check;
			if(N > num) {
				continue;
			}else if(N == num) {
				ans = i + 1;
				break;
			}else {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
