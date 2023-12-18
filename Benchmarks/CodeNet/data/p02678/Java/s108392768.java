import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int edge = sc.nextInt();
		int[] masterNodeList= new int[V];
		ArrayDeque<Integer> noticeQueue = new ArrayDeque<Integer>();
		List<Integer>[] edgeList = new ArrayList[V + 1]; //各nodeが持つedgeを集約して集合化
		for (int i = 0; i < edgeList.length; i++) {
			edgeList[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < edge; i++) {
			int edge_a = sc.nextInt();
			int edge_b = sc.nextInt();
			edgeList[edge_a].add(edge_b);
			edgeList[edge_b].add(edge_a);
		}

		Arrays.fill(masterNodeList, -1);

		noticeQueue.add(1);

		int target;

		while (!noticeQueue.isEmpty()) {
			target = noticeQueue.poll();

			for (Integer edges : edgeList[target]) {
				if (masterNodeList[edges - 1] == -1) {
					masterNodeList[edges - 1] = target;
					noticeQueue.add(edges);
				}
			}
		}

		System.out.println("Yes");
		for (int i = 1; i < V; i++) {
			System.out.println(masterNodeList[i]);
		}
	}
}