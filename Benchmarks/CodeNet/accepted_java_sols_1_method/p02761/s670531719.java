import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		Integer array[] = new Integer[3];
		// 初期化
		for(int i = 0; i < 3; i++) {
			array[i] = -1;
		}
		
		for(int i = 0; i < m; i++) {
			int s = scan.nextInt() - 1;
			int c = scan.nextInt();
			// Nが2桁or3桁で1桁目が0は存在しない
			if(n != 1 && s == 0 && c == 0) {
				System.out.println(-1);
				return;			
			}
			// 既に入力済みかつ違う数値は存在しない
			if(array[s] != -1 && array[s] != c) {
				System.out.println(-1);
				return;			
			}
			// s桁目の初めての入力
			if(array[s] == -1) {
				array[s] = c;
			}
		}

		// 入力されていない桁に最小値を設定
		for(int i = 0; i < 3; i++) {
			// Nが2桁or3桁の1桁目が未入力
			if(n != 1 && i == 0 && array[i] == -1) {
				array[i] = 1;
			}
			if(array[i] == -1){
				array[i] = 0;
			}
		}
		int num = 0;
		for(int i = 0;i < n;i++) {
	    	if(i != 0) {
	    		num = num*10;
	        }
	    	num = num + array[i];
	    }
		System.out.println(num);
		return;
		
	}
}