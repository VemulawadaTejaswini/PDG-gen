import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int edge = sc.nextInt();

		int[][] edgeList = new int[edge][2];
		int[][] guidePostsList = new int[V][2];
		boolean[] seenFlgs = new boolean[V];

		for (int i = 0; i < edge; i++) {
			edgeList[i][0] = sc.nextInt();
			edgeList[i][1] = sc.nextInt();
		}

		Main main = new Main();
		//DFS
		seenFlgs[0] = true;
		main.DFS(1, 1, 0, seenFlgs, guidePostsList, edgeList);
		StringBuilder sb = new StringBuilder();
		sb.append("Yes");
		sb.append("\n");
		for (int i = 1; i < V; i++) {
			if (guidePostsList[i][0] == 0) {
				System.out.println("No");
				break;
			}else {
				sb.append(guidePostsList[i][1] + "\n");
			}
			if (i == V-1) {
				System.out.println(sb.toString());
			}
		}
	}

	public void DFS(int node,int depth,int masterNode,boolean[] seenFlgs,int[][] guidePostsList,int[][] edgeList) {
		//更新
		seenFlgs[node - 1] = true;

		if (guidePostsList[node - 1][0] == 0 || guidePostsList[node - 1][0] > depth) {
			guidePostsList[node - 1][0] = depth; //最短
			guidePostsList[node - 1][1] = masterNode; //最短の時の親node
		}

		for (int i = 0; i < edgeList.length; i++) {
			//a -> b
			if (edgeList[i][0] == node && seenFlgs[edgeList[i][1] - 1] == false) {
				//再帰
				DFS(edgeList[i][1],depth + 1, node, seenFlgs, guidePostsList, edgeList);
				seenFlgs[edgeList[i][1] - 1] = false;
			}
			//b -> a
			if (edgeList[i][1] == node && seenFlgs[edgeList[i][0] - 1] == false) {
				//再帰
				DFS(edgeList[i][0],depth + 1, node, seenFlgs, guidePostsList, edgeList);
				seenFlgs[edgeList[i][0] - 1] = false;
			}
		}

		return;
	}
}