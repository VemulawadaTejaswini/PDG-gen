
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		Set<Integer>list = new TreeSet<Integer>();

		if (B-A+1<K) {
			K=B-A+1;
		}
		for (int i = A; i < A+K; i++) {
			list.add(i);
		}
		for (int i = B-K + 1; i <= B; i++) {
			list.add(i);
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}


}

