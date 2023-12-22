

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);

			int n = scanner.nextInt();

			int [] h = new int [n];
			for(int i=0; i<n; i++) {
				h[i] = scanner.nextInt();
			}

			Main testC = new Main();
			System.out.println(testC.buildStairs(n, h));

			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}


	public String buildStairs(int n, int[] h) {
//		for(int i=1; i<n; i++){
//			if(h[i-1] > h[i]) {
//				if(h[i-1] - 1 > h[i]) {
//					return "No";
//				} else if (i != 1 && h[i-2] > h[i-1] - 1){ //1つ目はi-2が-1でエラーになるので弾く
//					return "No";
//				} else {
//					h[i-1] = h[i-1] - 1;
//				}
//			}
//		}

		for(int i=n-1; i>0; i--) {
			if(h[i-1] > h[i]) {
				if(h[i-1] - 1 > h[i]) {
					return "No";
				} else if (i != 1 && h[i-2] > h[i-1]){ //1つ目はi-2が-1でエラーになるので弾く
					return "No";
				} else {
					h[i-1]--;
				}
			}
		}

		return "Yes";
	}

}

