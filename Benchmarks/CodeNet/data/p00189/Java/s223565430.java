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
			int road[][] = new int[10][10];
			boolean town[] = new boolean[10];
			for (int i=0;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				road[a][b] = c;
				road[b][a] = c;
				town[a] = town[b] = true;
			}
			int ans1 = -1,timeMin=INF,timeMinNum=1;
			for (int i=0;i<10;i++) {
				if(!town[i]) {
					continue;
				}
				int cost[] = new int[10];
				for(int j=0;j<10;j++) {
					cost[j] = INF;
				}
				cost[i] = 0;
				for (int j=0;j<10;j++) {
					for (int to=0;to<10;to++) {
						for (int from=0;from<10;from++) {
							if(road[from][to]!=0 && cost[from]+road[from][to]<cost[to]) {
								cost[to]=cost[from]+road[from][to];
							}
						}
					}
				}
				int sum = 0;
				for(int j=0;j<10;j++) {
					if (town[j]) {
						sum+=cost[j];
					}
				}
				if (timeMin>=sum) {
					if (timeMin==sum) {
						timeMinNum++;
					}else{
						timeMin = sum;
						timeMinNum = 1;
						ans1 = i;
					}
				}
			}
			System.out.println(ans1+" "+(timeMin*timeMinNum));
		}
	}
}