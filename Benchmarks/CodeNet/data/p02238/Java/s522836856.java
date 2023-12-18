import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
static int[] color;
static int[] f;
static int[] d;
static int[][] list;
static int time;
public static void main(String[] args) {
	int n = s.nextInt();
	int u,k,v;
	d = new int[n];
	f = new int[n];
	color = new int[n];
	list = new int[n][n];

	for(int i = 0;i < n;i++) {
		u = s.nextInt();
		k = s.nextInt();
		while(k > 0) {
			v = s.nextInt();
			list[u-1][v-1] = 1;
			k--;
		}
	}
	dfs(n);
	for(int i = 0;i < n;i++) {
		System.out.println(i+1 + " " + d[i] + " " + f[i]);
	}

}

static void dfs(int n) {
	for(int i = 0;i < n;i++) {
		color[i] = 0;
	}
	time = 0;
	for(int i = 0;i < n;i++) {
		if(color[i] == 0) {
			visit(n,i);
		}
	}
}

static void visit(int n,int u) {
	color[u] = -1;
	d[u] = ++time;
	for(int i = 0;i < n;i++) {
		if(color[i] ==0 && list[u][i] ==1 ) {
			visit(n,i);
		}
	}
		color[u] = 1;
		f[u] = ++time;

}
}


