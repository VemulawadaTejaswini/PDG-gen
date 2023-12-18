import java.util.*;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
class Main{
    static final int N = 101;
    static final long mod = 100000007;
    static long comb[][]=new long[N][N];
    static void precalc(){
	comb[0][0]=1;
	for(int i=1;i<N;i++){
	    comb[i][0]=comb[i][i]=1;
	    for(int j=1;j<i;j++){
		comb[i][j]=(comb[i-1][j]+comb[i-1][j-1])%mod;
	    }
	}
    }

    public static void main(String[] args){
	precalc();
	int n;
	Scanner scanner = new Scanner(System.in);
	while(true){
	    n = scanner.nextInt();
	    if (n == 0)break;
	    int next[] = new int[n];
	    BigDecimal p1[]=new BigDecimal[n],p2[]=new BigDecimal[n];
	    boolean vis[]=new boolean[n];
	    BigDecimal one=new BigDecimal(1);
	    BigDecimal eps=new BigDecimal(1e-19);
	    for(int i=0;i<n;i++){
		int tmp;
		p1[i]=scanner.nextBigDecimal();
		p1[i]=one.divide(p1[i],30,RoundingMode.HALF_EVEN);
		tmp=scanner.nextInt();
		p2[i]=scanner.nextBigDecimal();
		p2[i]=one.divide(p2[i],30,RoundingMode.HALF_EVEN);
		next[tmp]=i;
		vis[i]=false;
	    }

	    int all = n;
	    long ans = 1;
	    double exp=0;
	    BigDecimal bExp=new BigDecimal(0);
	    for(int k=0;k<n;k++){
		if (vis[k] == true)continue;
		int now = k;
		int in[]=new int[n];
		int ind=0;
		while(vis[now] == false){
		    vis[now]=true;
		    in[ind++]=now;
		    now=next[now];
		}
		BigDecimal mini = new BigDecimal(1e20);
		int cnt=0;
		for(int i=0;i<ind;i++){
		    BigDecimal tmp=p1[in[i]];
		    for(int j=0;j<ind;j++){
			if (i != j)tmp=tmp.add(p2[in[j]]);
		    }
		    if (eps.compareTo((mini.subtract(tmp)).abs()) == 1){
			cnt++;
		    }else if (mini.compareTo(tmp) == 1) {
			cnt=1;
			mini=tmp;
		    }
		}
		ans=ans*cnt;
		ans%=mod;
		ans=ans*comb[all][ind];
		bExp=bExp.add(mini);
		//System.out.println(mini.toPlainString());
		all-=ind;
	    }
	    if (all != 0)System.out.println("WA");
	    System.out.println(bExp + " " + ans);
	}
    }
}