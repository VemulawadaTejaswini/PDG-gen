import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int result = 0;
		ArrayList<Integer> h = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			h.add(sc.nextInt());
			if(h.get(i) >= K) {
				result++;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
