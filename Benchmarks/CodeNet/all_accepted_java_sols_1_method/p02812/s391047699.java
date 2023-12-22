//java 11.0.1 2018-10-16 LTS

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//標準入力からテキストを読み取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		//処理を行う
		int ret = 0;
		for(int i = 0; i < n-2; i++){
			if(s.substring(i, i+3).equals("ABC")){
				ret++;
			}
		}
		
		//標準出力に出力する
		System.out.println(ret);
	}
}