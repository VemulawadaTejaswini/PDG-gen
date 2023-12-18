import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		while(true){
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
		
		if(n==0 && m==0){
			if(s==0 && g1==0){
				if(g2==0){break;}
			}
		}
		
		int[][] road= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				road[i][j]=10000;
				if(i==j){
					road[i][j]=0;
				}
			}
		}
		

		num=0;
		while(num<m){
			int i=sc.nextInt();
			int j=sc.nextInt();
			int cost=sc.nextInt();
			road[i-1][j-1]=cost;
			road[j-1][i-1]=cost;
			num++;
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
		int r=road[0][s-1]+road[0][g1-1]+road[0][g2-1];
		for(int k=0;k<n;k++){
			if(r>road[k][s-1]+road[k][g1-1]+road[k][g2-1]){
				r=road[k][s-1]+road[k][g1-1]+road[k][g2-1];
			}
		}
		System.out.println(r);
		}
	}

}