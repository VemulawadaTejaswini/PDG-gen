import java.util.Scanner;

public class Main {
	//しゃくとり法 
	//sから始まる部分列で最初にnになる部分列をs+....+(t-1)とする
	//s+1から始まる部分列は(s+1)+....+(t'-1)とするとt<=t'
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int res=0;
				int s=1, t=1, sum=0;//①初期化
				int a=0;//最大長さのときのsを入れる
				for(;;) {
					while(t<=n && sum<n) {
						sum+=t;
						t++;
					}//②sum<nの間、sumをt増やしtを1増やす(tの探索)
					if(sum<n) break;
					if(res<t-s && sum==n) {
						a=s;
						res=t-s;
						break;
					}//③resより長い長さの部分列が見つかって(最初に見つかったやつが一番長い)それがsum=nの時更新
					sum-=s;//④sumをs減らし、sを1増やして次のt'を見つけに行く
					s++;
				}
				System.out.println(a+" "+res);
			}


		}
	}
}
