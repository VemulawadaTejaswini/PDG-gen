import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int M=sc.nextInt();	//数字の種類
			int N=sc.nextInt();	//部分和にしたい数
			if(N*M==0) {
				System.exit(0);
			}
			int[] A=new int[N];	//数字
			int[] C=new int[N];	//数字の個数
			int[] dp=new int[M+1];
			boolean[] kousin=new boolean[M+1];		//値の更新を無限回行わないようにすでに更新を行ったか？のフラグ
			Arrays.fill(dp, -1); 	//dpを0で埋めると0枚で払えると混同する（工夫すれば0フィルでも行けそうだけど）
			for(int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}
			for(int i=0; i<N; i++) {
				C[i]=(M+A[i]-1)/A[i];
			}
			dp[0]=0;	//いつもの
			for(int i=0; i<N; i++) {
				for(int j=M; j>=0; j--) {		//すでにお金の払い方として成立する場合で、払う枚数の最小を更新する時に、更新した値で更に更新しないように高い値から処理していく
					if(!kousin[j] && dp[j]>=0) {
						int roop=Math.min(C[i],(M-j)/A[i]);
						for(int k=roop; k>=0; k--) {	//使用限度を守っていてなおかつ求めたい額よりも少ない
							if(!kousin[j+k*A[i]]) {		//未更新の場合（これがはじめての更新の時できる）
								if(dp[j+k*A[i]]==-1) {	//いままでのお金だと払えなかった時
									dp[j+k*A[i]]=dp[j]+k;
									kousin[j+k*A[i]]=true;
								}
								else if(dp[j+k*A[i]]>=0) {	//より少ない枚数でお金をちょうど出せるか？
									dp[j+k*A[i]]=Math.min(dp[j+k*A[i]], dp[j]+k);
									//kousin[j+k*A[i]]=true;	//すでにお金の払い方として成立するので更新には入らない
								}
							}
						}
					}
				}
				Arrays.fill(kousin, false);
			}
			/*int cnt=0;
			for(int i=1; i<=M; i++) {
				if(dp[i]>=0) {
					//System.out.println(i+" "+dp[i]);
					cnt++;
				}
			}*/
			System.out.println(dp[M]);
		}
	}
}
