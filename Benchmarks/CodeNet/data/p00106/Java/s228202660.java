import java.util.Scanner;

public class Main {
	static int  min=Integer.MAX_VALUE;
	static int w[] = {200,300,500};
	static int p[] = {380,550,850};
	static int e[] = {5,4,3};
	static double r[] = {0.8,0.85,0.88};

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			min = Integer.MAX_VALUE;
			solve(0,n,0);
			System.out.println((int)min);
		}
	}

	public static void solve(int k, int rest,int cost) {
		if (rest == 0){
			min = Math.min(min, cost);
			return;
		}
		if(k==3||rest<0)return;
		for(int i=0;i<=5000/w[k];i++){
			solve(k+1,rest-w[k]*i,cost+(int)((i-i%e[k])*r[k]*p[k]+i%e[k]*p[k]));
		}
	}
}