import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] Days=new int[N+1];
		Arrays.fill(Days,-1);
		int[][][] flag=new int[N+1][4][2];
		for(int i=0;i<N+1;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<2;k++){
					flag[i][j][k]=0;
				}
			}
		}
		for(int i=0;i<K;i++){
			Days[sc.nextInt()]=sc.nextInt();
		}
		int sum=0;
		//
		if(Days[1]==-1){
			flag[1][1][0]=1;
			flag[1][2][0]=1;
			flag[1][3][0]=1;
		}
		else{
			flag[1][Days[1]][0]=1;
		}
		//
		for(int i=2;i<=N;i++){
			if(Days[i]==-1){
				for(int j=1;j<=3;j++){
					for(int k=1;k<=3;k++){
						if(j!=k){
							flag[i][j][0]+=flag[i-1][k][0]%10000;
							flag[i][j][0]+=flag[i-1][k][1]%10000;
						}
						else{
							flag[i][j][1]+=flag[i-1][k][0]%10000;
						}
					}
				}
			}
			else{
				for(int k=1;k<=3;k++){
					if(Days[i]!=k){
						flag[i][Days[i]][0]+=flag[i-1][k][0]%10000;
						flag[i][Days[i]][0]+=flag[i-1][k][1]%10000;
					}
				}
				flag[i][Days[i]][1]+=flag[i-1][Days[i]][0]%10000;
			}
		}
		//
		for(int i=1;i<=3;i++){
			for(int j=0;j<2;j++){
				sum+=flag[N][i][j];
			}
		}
		//
		System.out.println(sum%10000);
	}
}