package p0070;
import java.util.Arrays;
import java.util.Scanner;

class Main {

	Scanner sc = new Scanner(System.in);



	public int dfs(int pos,int v,int bit){
		if(pos==n)return v==s?1:0;
		if(v>s)return 0;
		if(dp[pos][v][bit]!=-1)return dp[pos][v][bit];
		int res=0;
		for(int i=0;i<=9;i++){
			if(((bit>>i)&1)==0)
				res+=dfs(pos+1,v+(pos+1)*i,bit|(1<<i));
		}
		return dp[pos][v][bit]=res;
	}

	int[][][] dp=new int[10][350][1<<10];

	int n,s;
	public void run() {
		for(int i=0;i<10;i++)for(int j=0;j<350;j++)Arrays.fill(dp[i][j],-1);


		while(sc.hasNext()){
			n=sc.nextInt();s=sc.nextInt();

			ln(dfs(0,0,0));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}