import java.util.Scanner;

class Main {

	Scanner sc = new Scanner(System.in);



	public int[][] dp=new int[11][350];
	public int dfs(int pos,int v,int bit){
		if(pos==10)return v==s?1:0;
		dp[pos][v]++;
		int res=0;
		for(int i=0;i<=9;i++){
			if(((bit>>i)&1)==0)
				res+=dfs(pos+1,v+(pos+1)*i,bit|(1<<i));
		}
		return res;
	}

	int n,s;
	public void run() {
		dfs(0,0,0);
		while(sc.hasNext()){
			n=sc.nextInt();s=sc.nextInt();
			if(s>=350)ln(0);
			else ln(dp[n][s]);
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