import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[] kumo = new char[W];
		int[][] ans = new int [H][W];
		int count = 0;
		int no = 0;
		for(int k = 0; k < H; k++){
			kumo = sc.next().toCharArray();
			for(int j = 0; j < W; j++){
				for(int l = j; l >= 0; l--){
					if(kumo[l] == 'c'){
						ans[k][j] = count;
						no = 1;
						break;
					}else if(kumo[l] == '.'){
						count = count + 1;
					}
				}
				if(no == 0){
					ans[k][j] = -1;
				}
				count = 0;
				no = 0;
			}
		}
		for(int i = 0; i < H; i++){
			for(int k = 0; k < W; k++){
				System.out.print(ans[i][k]);
				if(k != W - 1){
					System.out.print(" ");
				}
			}
		System.out.println("");
		}

	}

}