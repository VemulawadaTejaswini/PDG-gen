import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> botton = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			botton.add(Integer.parseInt(sc.next()) - 1);
		}
		sc.close();

		int count = 0;
		int now = 0;

		for(int i = 0; i <= N ;i++) {
			if(now == 1) {
				System.out.println(count);
				return;
			}
			if(count == N) {
				System.out.println(-1);
				return;
			}
			count++;
			now = botton.get(now);
		}
	}

}