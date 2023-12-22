import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] ary = new int[N][2];
		for(int i = 0;i < N;i++) {
			ary[i][0] = sc.nextInt();
			ary[i][1] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(ary, Comparator.comparingInt(i -> i[0]));
		long res = 0;
		int cnt = 0;
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i = 0;i < M;i++) {
			while(cnt< N && ary[cnt][0]<=i+1) {
				pq.add(ary[cnt][1]);
				cnt++;
			}
			if(!pq.isEmpty())res += (long)pq.poll();
		}
		System.out.println(res);
	}
}