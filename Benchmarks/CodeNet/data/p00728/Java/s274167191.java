import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][] score=new int[200][1000];
		int i=0,m=0,M=0,n;
		int[] result=new int[200];
		for(int k=0;k<200;k++){
			result[k]=0;
		}
		while((n = sc.nextInt())!=0){
			for(int j=0;j<n;j++){
				score[i][j]=sc.nextInt();
				if(score[i][M]<=score[i][j]){
					M=j;
				}else if(score[i][j]<=score[i][m]){
					m=j;
				}
				result[i]+=score[i][j];
			}
			result[i]-=score[i][M];
			result[i]-=score[i][m];
			result[i]/=(n-2.0);
			i++;
		}
		for(int j=0;j<i;j++){
			System.out.printf("%d\n",result[j]);
		}
	}
}