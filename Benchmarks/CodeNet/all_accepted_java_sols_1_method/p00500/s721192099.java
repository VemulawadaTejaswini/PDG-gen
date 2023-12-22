import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();//人数
		int [][] card = new int [N][3];
		int [] flg = new int [N];
		int [] score = new int [N];
		for(int i = 0; i < N; i++){
			for(int m = 0; m < 3; m++){
				card[i][m] = in.nextInt();
			}
		}
		for(int m = 0; m < 3; m++){
			for(int i = 0; i < N; i++){
				for(int k = i + 1; k < N; k++){
					if(card[i][m] == card[k][m]){
						flg[i]++;
						flg[k]++;
					}
				}
				if(flg[i] == 0){
					score[i] += card[i][m];
				}
			}
			for(int p = 0; p < N; p++){
				flg[p] = 0;
			}
		}
		for(int i = 0; i < N; i++){
			System.out.println(score[i]);
		}
	}

}