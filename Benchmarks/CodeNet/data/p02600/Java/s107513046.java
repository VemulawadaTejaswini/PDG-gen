package aaa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int ans = 8;
		for(int i = 1; i < 9; i++) {
			if(x > 199 + i*200 && x < 400 + i*200) {
				ans = ans-i+1;
			}
		}
		String s = String.valueOf(ans);
		System.out.print(s);
	}

}
