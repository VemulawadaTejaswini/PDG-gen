import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[][] score = new int[n][3];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < 3;j++){
					score[i][j] = scan.nextInt();
				}
			}
			boolean fl = false;
			for(int i = 0;i < 3;i++){
				for(int j = 0;j < n-1;j++){
					fl = false;
					for(int k = j+1;k < n;k++){
						if(score[j][i] == score[k][i]){
							fl = true;
							score[k][i] = 0;
						}
					}
					if(fl){
						score[j][i] = 0;
					}
				}
			}
			for(int i = 0;i < n;i++){
				System.out.println(score[i][0] + score[i][1] + score[i][2]);
			}
		}
	}
}