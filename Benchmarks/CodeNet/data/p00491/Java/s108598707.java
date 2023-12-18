import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int N,K;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();//何日間の予定を考えるか
		K=sc.nextInt();//何日間の予定が決まっているか
		int pasta[][]=new int[6][N+1];
		int pastaplan[]=new int[N+1];
		for(int i=0;i<K;i++){
			int day=sc.nextInt();//何日の予定が決まっているか
			pastaplan[day]=sc.nextInt();//その日のパスタは何か
		}
		if(pastaplan[1]==0){//もし１日目の予定が決まっていなければ
			pasta[1][1]=1;pasta[3][1]=1;pasta[5][1]=1;
		}else if(pastaplan[1]==1){
			pasta[1][1]=1;
		}else if(pastaplan[1]==2){
			pasta[3][1]=1;
		}else if(pastaplan[1]==3){
			pasta[5][1]=1;
		}
		for(int j=2;j<=N;j++){
			if(pastaplan[j]==0){//j日の予定がきまってなければ
				pasta[0][j]=pasta[1][j-1];//２日連続の時には前日の１日目の値がそのままくる。
				pasta[2][j]=pasta[3][j-1];
				pasta[4][j]=pasta[5][j-1];
				pasta[1][j]=pasta[2][j-1]+pasta[3][j-1]+pasta[4][j-1]+pasta[5][j-1];
				pasta[3][j]=pasta[0][j-1]+pasta[1][j-1]+pasta[4][j-1]+pasta[5][j-1];
				pasta[5][j]=pasta[0][j-1]+pasta[1][j-1]+pasta[2][j-1]+pasta[3][j-1];
			}else if(pastaplan[j]==1){//j日の予定がトマトだったら
				pasta[0][j]=pasta[1][j-1];//２日連続の時には前日の１日目の値がそのままくる。
				pasta[1][j]=pasta[2][j-1]+pasta[3][j-1]+pasta[4][j-1]+pasta[5][j-1];
			}else if(pastaplan[j]==2){
				pasta[2][j]=pasta[3][j-1];
				pasta[3][j]=pasta[0][j-1]+pasta[1][j-1]+pasta[4][j-1]+pasta[5][j-1];
			}else{
				pasta[4][j]=pasta[5][j-1];
				pasta[5][j]=pasta[0][j-1]+pasta[1][j-1]+pasta[2][j-1]+pasta[3][j-1];
			}
		}
		int sum=pasta[0][N]+pasta[1][N]+pasta[2][N]+pasta[3][N]+pasta[4][N]+pasta[5][N];
		System.out.println(sum%10000);
	}
}