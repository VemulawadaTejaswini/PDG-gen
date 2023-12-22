import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt(); //頂点
		int edge = sc.nextInt(); //辺

		int[] masterNodeList = new int[V];
		ArrayDeque<Integer> noticeQueue = new ArrayDeque<Integer>();
		List<Integer>[] edgeList = new ArrayList[V + 1]; //各nodeが持つedgeを集約する

		for (int i = 0; i < edgeList.length; i++) {
			edgeList[i] = new ArrayList<Integer>();
		}

		//辺をノードごとに集約
		for (int i = 0; i < edge; i++) {
			int edge_a = sc.nextInt();
			int edge_b = sc.nextInt();
			edgeList[edge_a].add(edge_b);
			edgeList[edge_b].add(edge_a);
		}

		for (int i = 1; i < edgeList.length; i++) {
			List<Integer> list = edgeList[i];
			System.out.println(list.size());
		}

	}
}

