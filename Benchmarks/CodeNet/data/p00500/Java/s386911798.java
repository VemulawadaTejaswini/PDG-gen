import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int player[][]=new int[n][3];
		int sum[]=new int[n];
		int checknum;
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				player[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<n;j++){
				checknum=player[j][i];
				for(int k=0;k<n;k++){
					if(checknum == player[k][i] && k!=j){
						player[k][i]=0;
						player[j][i]=0;
					}		
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				sum[i]+=player[i][j];
			}
			System.out.println(sum[i]);
		}
		
	}

}