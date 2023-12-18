import java.util.Scanner;;
public class Main {
static Scanner s = new Scanner(System.in);
static int Time = 0;
static int[] l;
static int a,b = 1;
public static void main(String[] args) {
	int n = s.nextInt();
	int[][] gr = new int[n+1][n];
	int[] d = new int[n+1];
	l = new int[n+1];

	for(int i = 0;i < n;i++) {
		int u = s.nextInt();
		int k = s.nextInt();
		d[u] = -1;
		for(int j = 0;j < k;j++) {
			gr[u][j] = s.nextInt();
		}
	}
	d[1] = 0;
	l[0] = 1;

	mas(gr,d);

	for(int i = 1;i <= n;i++) {
		System.out.println(i + " " + d[i]);
	}
}

static void mas(int[][] gr,int[] d) {
	for(a = 0;a < b;a++) {
		int e = l[a];
		for(int i = 0;i < gr[e].length;i++) {
			int f = gr[e][i];
			if(d[f] == -1) {
				d[f] = d[e] + 1;
				l[b++] = f;
			}
		}
	}
}
}
