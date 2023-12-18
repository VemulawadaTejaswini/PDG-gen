import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] player=new int[n][3];
		int[] point=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				player[i][j]=sc.nextInt();
			}
		}

		for(int j=0;j<3;j++){
			int k=1;
				for(int i=0;i<n;i++){
					while(k!=n){
						if(player[i][j]==player[k][j]){
							player[k][j]=0;
							player[i][j]=0;
						}else{

						}
						//System.out.printf("[%d]\n",player[k][j]);
						k++;
					}
				}
			}
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				point[i]+=player[i][j];
			}
		}
		for(int i=0;i<n;i++){
		System.out.printf("%d\n", point[i]);
		}
	}

}