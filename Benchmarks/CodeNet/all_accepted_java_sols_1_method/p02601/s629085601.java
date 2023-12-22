

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();//red
		int B = sc.nextInt();//green
		int C = sc.nextInt();//blue
		int K = sc.nextInt();

		//red < green and green < blue
		for(int i = 0; i < K; i++) {
			if(B <= A) {
				B = B*2;
			}else if(C <= B){
				C = C*2;
			}
		}

		if(A < B && B < C) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
