import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException{
		int num=0;
		int[] cc= new int[5];
		int n, m, s, g1, g2;
		
		Scanner sc = new Scanner(System.in);
		while(num<5){
			cc[num]=sc.nextInt();
			num++;
        }
		n=cc[0];
		m=cc[1];
		s=cc[2];
		g1=cc[3];
		g2=cc[4];
		
		int[][] road= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				road[i][j]=10000;
			}
		}
		num=0;
		while(true){
			int i=sc.nextInt();
			int j=sc.nextInt();
			int cost=sc.nextInt();
			if(i==0 && j==0){break;}
			road[i-1][j-1]=cost;
			road[j-1][i-1]=cost;
		}
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(road[i][j]>road[i][k]+road[k][j]){
						road[i][j]=road[i][k]+road[k][j];
					}
				}
			}
		}
		int r=10000;
		for(int k=0;k<n;k++){
			if(r>road[k][s-1]+road[k][g1-1]+road[k][g2-1]){
				r=road[k][s-1]+road[k][g1-1]+road[k][g2-1];
			}
		}
		System.out.println(r);
		
	}

}