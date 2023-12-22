
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer> favorite = new HashSet<>();
		for(int i = 1; i < M + 1; i++) {
			favorite.add(i);
		}
		for(int i = 0; i < N; i++) {
			int K = sc.nextInt();
			Set<Integer> tmp = new HashSet<>();
			for(int j = 0; j < K; j++) {
				tmp.add(sc.nextInt());
			}
			favorite.retainAll(tmp);
		}
		System.out.println(favorite.size());
	}

}
