import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		//整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer;
		int count = 0;
		int[] parent = new int[n];
		int[] rank = new int[n];

		for(int i=0; i<n ; i++) {
			parent[i] = i;
			rank[i] = 0;
		}

		for(int i=0; i<m ;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;

			while(a != parent[a]) {
				a = parent[a];
			}
			while(b != parent[b]) {
				b = parent[b];
			}
			int rootA = a;
			int rootB = b;

			if (rank[rootA] > rank[rootB]) {
	            parent[rootB] = rootA;        //x の木に結合
	        }
	        else if(rank[rootA] < rank[rootB]) {
	            parent[rootA] = rootB;        //y の木に結合
	        }
	        else if (rootA != rootB) {        //同じ高さで根が違うとき
	            parent[rootB] = rootA;        //x の木に結合
	            rank[rootA]++;                //x の木の高さを加算
	        }
		}

		for(int i=0; i<n; i++) {
			if(i == parent[i]) {
				count += 1;
			}
		}

		answer = count-1;

		System.out.println(answer);
	}
}
