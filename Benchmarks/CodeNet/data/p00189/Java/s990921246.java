import java.util.Scanner;
public class Main {
	public static final int INF = 100000000;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			int dist[][] = new int[10][10];
			for (int i=0;i<10;i++) {
				for (int j=0;j<10;j++) {
					if(i!=j) {
						dist[i][j] = INF;
					}
				}
			}
			boolean town[] = new boolean[10];
			for (int i=0;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				dist[a][b] = c;
				dist[b][a] = c;
				town[a] = town[b] = true;
			}
			for (int k=0;k<10;k++) {
				for (int i=0;i<10;i++) {
					for (int j=0;j<10;j++) {
						dist[i][j] = min(dist[i][j],dist[i][k] + dist[k][j]);
					}
				}
			}
			int costMin = INF;
			int costMinNum = 1;
			int costMinId = -1;
			for(int i=0;i<10;i++) {
				int sum = 0;
				for(int j=0;j<10;j++) {
					if(dist[i][j]!=INF) {
						sum+=dist[i][j];
					}
				}
				if (sum!=0) {
					if (sum<=costMin) {
						if (sum<costMin) {
							costMin = sum;
							costMinNum = 1;
							costMinId = i;
						}else{
							costMinNum++;
						}
					}
				}
			}
			System.out.println(costMinId + " " + (costMin*costMinNum));
		}
		sc.close();
	}
	public static int min(int a,int b) {
		return a<b ? a : b;
	}
}