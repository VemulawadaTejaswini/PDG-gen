/*フロイド法(AIZU_vol2_0200)*/
import java.util.Scanner;

class Main{
    
    public static void main(String[] args){   //メイン     
	
	String str1,str2;
	int INF=100000000;
	int SIZE=3002;  //配列サイズ
	int i,j,k,l;
	int n,m;    //線路の情報の数n,駅の数m
	int a,b;    //線路がつなぐ二つの駅a,b
	int p,q,r;  //出発駅p,到着駅q,出力する値r
	int[][] cost,time;  //料金cost[][],移動時間time[][]
	cost = new int[SIZE][SIZE];
	time = new int[SIZE][SIZE];

	Scanner in = new Scanner(System.in);  //入力のやつ

	while(true){  //無限ループ

	    n=in.nextInt();
	    m=in.nextInt();

	    //cost,timeを初期化
	    for(i=1;i<m+1;i++){
		for(j=1;j<m+1;j++){
		    cost[i][j]=INF;
		    time[i][j]=INF;
		}
	    }

	    //終了条件
	    if(n==0 && m==0)break;

	    //データの入力
	    for(i=0;i<n;i++){

		a=in.nextInt();
		b=in.nextInt();
		cost[a][b]=in.nextInt();
		time[a][b]=in.nextInt();

		cost[b][a]=cost[a][b];
		time[b][a]=time[a][b];
	    }

	    //ワーシャルフロイド法で最小コスト、最短時間を求める
	    for(i=1;i<m+1;i++){
		for(j=1;j<m+1;j++){
		    for(k=1;k<m+1;k++){
			cost[j][k]=Math.min(cost[j][k],cost[j][i]+cost[i][k]);
			time[j][k]=Math.min(time[j][k],time[j][i]+time[i][k]);
		    }
		}
	    }

	    l=in.nextInt();

	    //データの出力
	    for(i=0;i<l;i++){

		p=in.nextInt();
		q=in.nextInt();
		r=in.nextInt();

		if(r==1){
		    System.out.println(time[p][q]);
		} else {
		    System.out.println(cost[p][q]);
		}
	    }
	}

    }
	

}