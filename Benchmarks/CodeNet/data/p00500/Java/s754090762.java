
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] player=new int[n][3];

		int[][] player1=new int[n][3];
		int[] point=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				player[i][j]=sc.nextInt();
				player1[i][j]=player[i][j];
			}
		}

		for(int j=0;j<3;j++){

				for(int i=0;i<n;i++){
					for(int k=0;k<n;k++){
						if(player[i][j]==player[k][j]&&i!=k){
							player1[k][j]=0;
							player1[i][j]=0;
						}else{

						}
						//System.out.printf("[%d]\n",player[k][j]);

					}
				}
			}
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				//System.out.printf("[%d]\n", player[i][j]);
				point[i]+=player1[i][j];
			}
		}
		for(int i=0;i<n;i++){
		System.out.printf("%d\n", point[i]);
		}
	}

}