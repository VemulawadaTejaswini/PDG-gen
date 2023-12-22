
import java.util.*;

class Main {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//情報が何件入力されるかnで受け取る
		String s1 = sc.next();
		int n = Integer.parseInt(s1);
		
		//3次元配列で1フロア10部屋3階建ての公舎4棟のそれぞれの入居状況を格納する（初期値は０にする）
		int A[][][] = new int[10][3][4];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					A[k][j][i] = 0;
				}
			}
		}
		
		//入力された情報を受け取り入居状況を更新する
		for(int i = 0; i < n; i++){
			String s2 = sc.next();
			int b = Integer.parseInt(s2);
			String s3 = sc.next();
			int f = Integer.parseInt(s3);
			String s4 = sc.next();
			int r = Integer.parseInt(s4);
			String s5 = sc.next();
			int v = Integer.parseInt(s5);
			A[r-1][f-1][b-1] += v;
		}
		
		//更新した入居状況を表示する
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" " + A[k][j][i]);
				}
				System.out.println("");
			}
			if(i != 3){
				System.out.println("####################");
			}
		}
	}
}