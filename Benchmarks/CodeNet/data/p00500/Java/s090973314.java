import java.util.Scanner;
public class???Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] player=new int[3][n];
		int[] point=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				player[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<3;i++){
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				if(player[i][j]==player[i][k]){

				}else{
					point[i]+=player[i][j];
				}
			}
		}
		}
		for(int i=0;i<n;i++){
		System.out.printf("%d\n", point[i]);
		}
	}

}