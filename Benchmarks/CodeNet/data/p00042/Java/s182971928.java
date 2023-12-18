import java.io.*;
import java.util.StringTokenizer;

class Item {
	int cost,weight;

	Item(int c,int w) {
		this.cost = c;
		this.weight = w;
	}
}

class Main {
	private static final int NOT_ADD = -1;

	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
 
		try {
			long count = 1;
			while (true) {
				int W = Integer.parseInt(br.readLine());
				if (W==0) break;

				int N = Integer.parseInt(br.readLine());
				Item item[] = new Item[N];
				for (int i=0;i<N;i++) {
					StringTokenizer st = new StringTokenizer(br.readLine(),",");
					int c = Integer.parseInt(st.nextToken());
					int w = Integer.parseInt(st.nextToken());
					item[i] = new Item(c,w);
				}
				int T[][] = new int[N][W+1];
				for (int i=0;i<N;i++) {
					for (int j=0;j<=W;j++) T[i][j] = NOT_ADD;
				}
				T[0][0] = 0;
				T[0][item[0].weight] = item[0].cost;
				for (int i=1;i<N;i++) {
					for (int k=0;k<=W;k++) T[i][k] = T[i-1][k];
					for (int k=item[i].weight;k<=W;k++) {
						if (T[i-1][k-item[i].weight]!=NOT_ADD&&T[i-1][k-item[i].weight]+item[i].cost>T[i][k]) {
							T[i][k] = T[i-1][k-item[i].weight]+item[i].cost;
						} else if (T[i-1][k-item[i].weight]==NOT_ADD) {
							T[i][k] = item[i].cost;
						}
					}
				}
				int MaxCost = T[N-1][0];
				int MaxWeight = 0;
				for (int i=0;i<=W;i++) {
					if (MaxCost<T[N-1][i]) {
						MaxCost = T[N-1][i];
						MaxWeight = i;
					}
				}
				System.out.println("Case "+count+":");
				System.out.println((long)MaxCost);
				System.out.println(MaxWeight);
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}