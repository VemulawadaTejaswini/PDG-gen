import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][][] flor = new int[4][3][10];
		for(int i = 0; i < flor.length; i++){
			for(int j = 0; j < flor[i].length; j++){
				for(int k = 0; k < flor[i][j].length; k++){
					flor[i][j][k] = 0;
				}
			}
		}
		int n = sc.nextInt();
		for(int i = 0;i < n; i++){
			int tou = sc.nextInt() - 1;
			int kai = sc.nextInt() - 1;
			int ban = sc.nextInt() - 1;
			int num = sc.nextInt();
			flor[tou][kai][ban] += num;
			if(flor[tou][kai][ban] < 0){
				flor[tou][kai][ban] = 0;
			}
		}
		for(int i = 0; i < flor.length; i++){
			for(int j = 0; j < flor[i].length; j++){
				for(int k = 0; k < flor[i][j].length; k++){
					System.out.printf(" %d",flor[i][j][k]);
				}
				System.out.println();
			}
			if(i == flor.length - 1){
			}else{
				System.out.println("####################");
			}
		}
	}
}


