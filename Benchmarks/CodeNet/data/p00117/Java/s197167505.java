import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static void setEdge(List<ArrayList<int[]>> edge, String input) {
		String[] str = input.split(",");
		int from = Integer.parseInt(str[0]);
		int to = Integer.parseInt(str[1]);
		int cost1 = Integer.parseInt(str[2]);
		int cost2 = Integer.parseInt(str[3]);
		edge.get(from - 1).add(new int[] { to - 1, cost1 });
		edge.get(to - 1).add(new int[] { from - 1, cost2 });
	}
	
	static int[][] floydwarshall(List<ArrayList<int[]>> edge){
		int[][] dist = new int[edge.size()][edge.size()];
		/* 初期化 */
		for(int i = 0; i < edge.size(); i++){
			for(int j = 0; j < edge.size(); j++){
				dist[i][j] = Integer.MAX_VALUE;
			}
			dist[i][i] = 0;
			/*　隣接している接点についてコスト計算 */
			for(int[] e : edge.get(i)){
				dist[i][e[0]] = e[1];
			}
		}
		
		/* 中継地点となる節点について繰り返す */
		for(int k = 0; k < edge.size(); k++){
			for(int i = 0; i < edge.size(); i++){
				/* 2節点が隣接していない場合は処理しない */
				if(dist[i][k] == Integer.MAX_VALUE){
					continue;
				}
				
				for(int j = 0; j < edge.size(); j++){
					long newLength = dist[i][k];
					/* 
					 * どの節点と隣接しているかは考慮せず、
					 * 単にコスト計算と更新処理を行う
					 */
					newLength += dist[k][j];
					if(newLength < dist[i][j]){
						dist[i][j] = (int)newLength;
					}
				}
			}
		}
		
		return dist;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int city = s.nextInt();
		int numEdge = s.nextInt();
		List<ArrayList<int[]>> edge = new ArrayList<ArrayList<int[]>>();
		for(int i = 0; i < city; i++){
			edge.add(new ArrayList<int[]>());
		}
		for (int i = 0; i < numEdge; i++) {
			setEdge(edge, s.next());
		}
		String[] input = s.next().split(",");
		int start = Integer.parseInt(input[0]);
		int dest = Integer.parseInt(input[1]);
		int money = Integer.parseInt(input[2]);
		int price = Integer.parseInt(input[3]);

		int[][] dist = floydwarshall(edge);
		System.out.println(money - price - dist[start - 1][dest - 1] - dist[dest - 1][start - 1]);
	}

}