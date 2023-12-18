import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int H;
	int W;
	int[][] ans;
	void input(){
		H = sc.nextInt();
		W = sc.nextInt();
		ans = new int [H][W];
		char[] kumo = new char[W];
		for(int i = 0; i < H; i++){
			kumo = sc.next().toCharArray();
			keisan(i, kumo);
		}
	}
	void keisan(int i, char kumo[]){
		int count = 0;
		int no = 0;
		for(int j = 0; j < W; j++){
			for(int l = j; l >= 0; l--){
				if(kumo[l] == 'c'){
					ans[i][j] = count;
					no = 1;
					break;
				}else if(kumo[l] == '.'){
					count = count + 1;
				}
			}
			if(no == 0){
				ans[i][j] = -1;
			}
			count = 0;
			no = 0;
		}
	}
	
	void output(){
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
	
	
	void doIt(){
		input();
		output();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main() . doIt();
	}

}