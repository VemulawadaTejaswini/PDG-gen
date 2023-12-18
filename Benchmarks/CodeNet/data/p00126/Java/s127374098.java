import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N  = cin.nextInt();
		while(N--!=0){
			int[][][] field = new int[10][10][2];
			for(int i = 1;i<10;i++){
				for(int j = 1;j<10;j++){
					field[i][j][0]=cin.nextInt();
				}
			}
			for(int i = 1;i<10;i++){
				
				int[] already = new int[10]; 
				for(int j = 1;j<10;j++){
					if(already[field[i][j][0]]>0){
						field[i][j][1]=1;
						already[field[i][j][0]]++;
					}
					else{
						already[field[i][j][0]]++;
					}
				}
				for(int j = 1;j<10;j++){
					if(already[field[i][j][0]]>1){
						field[i][j][1]=1;
					}
				}
			}
			for(int i = 1;i<10;i++){
				int[] already = new int[10]; 
				for(int j = 1;j<10;j++){
					if(already[field[j][i][0]]>0){
						field[j][i][1]=1;
						already[field[j][i][0]]++;
					}
					else{
						already[field[j][i][0]]++;
					}
				}
				for(int j = 1;j<10;j++){
					if(already[field[j][i][0]]>1){
						field[j][i][1]=1;
					}
				}
			}
			for(int k = 1;k<10;k+=3){
				for(int h = 1;h<10;h+=3){
					int[] already = new int[10];
					for(int i = 0;i<3;i++){
						for(int j = 0;j<3;j++){
							if(already[field[i+k][j+h][0]]>0){
								field[i+k][j+h][1]=1;
							}
							else{
								already[field[i+k][j+h][0]]++;
							}
						}
					}
					for(int i = 0;i<3;i++){
						for(int j = 0;j<3;j++){
							if(already[field[i+k][j+h][0]]>1){
								field[i+k][j+h][1]=1;
							}
						}
					}
				}
			}
			for(int i = 1;i<10;i++){
				for(int j = 1;j<10;j++){
					if(field[i][j][1]==1){
						System.out.print("*" + field[i][j][0]);
					}
					else{
						System.out.print(" " + field[i][j][0]);
					}
				}
				System.out.println();
			}
		}
	}

}