import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		Queue<Long> queue = new ArrayDeque<Long>();

		for (long i=1; i<=9; i++){
			queue.add(i);
		}

		for (int i=1; i<=k; i++){
			long poll = queue.poll();
			long amari = poll % 10;
			if (amari !=0) {
				queue.add(poll *10 + amari -1);
			}
			queue.add(poll * 10 + amari);
			if (amari !=9) {
				queue.add(poll * 10 + amari + 1);
			}
			if (i==k){
				System.out.println(poll);
			}
		}
	}
}