import java.util.Scanner;

//Maximum Sum Sequence II
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] a = new long[n+1][n+1];
		for(int i=1;i<=n;i++)for(int j=1;j<=n;j++){
			int x = sc.nextInt();
			a[i][j] = a[i-1][j] + a[i][j-1] - a[i-1][j-1] + x;
		}
		long res = Long.MIN_VALUE;
		for(int i=1;i<=n;i++)for(int j=1;j<=n;j++)for(int y=1;y<=n;y++)for(int x=1;x<=n;x++)res=Math.max(res, a[i][j]-a[y-1][j]-a[i][x-1]+a[y-1][x-1]);
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}