import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N < 2 || 200 < N){
			System.out.println("2から200までの数を入力してください。");
			N = sc.nextInt();
		}
		int[][] num = new int[N][3];
		int[] point = new int[N];
		int ptswt = 0;
		for(int i = 0; i < N; i++){
			point[i] = 0;
		}
		for(int i = 0; i < N; i++){
			num[i][0] = sc.nextInt();
			while(num[i][0] < 1 || 100 < num[i][0]){
				System.out.println("1から100までの数を入力してください。");
				num[i][0] = sc.nextInt();
			}
			num[i][1] = sc.nextInt();
			while(num[i][1] < 1 || 100 < num[i][1]){
				System.out.println("1から100までの数を入力してください。");
				num[i][1] = sc.nextInt();
			}
			num[i][2] = sc.nextInt();
			while(num[i][2] < 1 || 100 < num[i][2]){
				System.out.println("1から100までの数を入力してください。");
				num[i][2] = sc.nextInt();
			}
		}
		for(int j = 0; j < N; j++){ //参照するプレイヤー
			for(int i = 0; i < 3; i ++){ //ゲームの回数
				ptswt = 1;
				for(int k = 0; k < N; k++){ //その他のプレイヤー
					if(j != k){
						if(num[j][i] == num[k][i]){
							ptswt = 0;break;
						}
					}
				}
				if(ptswt == 1){
					point[j] += num[j][i];
				}
			}
		}
		for(int i = 0; i < N; i++){
			System.out.println(point[i]);
		}
		return;
	}
}