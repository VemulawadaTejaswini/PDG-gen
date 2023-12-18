import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int box[][] = new int[i][3];
		int check[][] = new int[i][3];
		int kei[] = new int[i];
		
		for(int j = 0; j < i; j++){
			kei[j] = 0;
			for(int k = 0; k < 3; k++){
				check[j][k] = 0;
			}
		}
		
		for(int j = 0; j < i; j++){
			for(int k = 0; k < 3; k++){
				box[j][k] = sc.nextInt();
			}
		}
		
		for(int j = 0; j < 3; j++){
			for(int k = 0; k < i; k++){
				for(int l = k + 1; l < i; l++){
					if(box[k][j] == box [l][j]){
						check[k][j] = 1;
						check[l][j] = 1;
					}
				}
			}
		}
		
		for(int j = 0; j < i; j++){
			for(int k = 0; k < 3; k++){
				if(check[j][k] == 1){
					box[j][k] = 0;
				}
				kei[j] = kei[j] + box[j][k];
			}
		}
		
		for(int j = 0; j < i; j++){
			System.out.println(kei[j]);
		}
	}
}