import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		String S = sc.next();
		sc.close();
		
		int answer = 0; 
		ArrayList<Character> charList = new ArrayList<>();
		
		for(int i = 0; i < S.length(); i++) {
			charList.add(S.charAt(i));
		}
		
		if(charList.get(0) == 'R') {
			if(charList.get(1) == 'R') {
				if(charList.get(2) == 'R') {
					answer = 3;
				}else {
					answer = 2;
				}
			}else {
				answer = 1;
			}
		}else {
			//最初がＳ
			if(charList.get(1) == 'R') {
				if(charList.get(2) == 'R') {
					answer = 2;
				}else {
					answer = 1;
				}
			}else {
				if(charList.get(2) == 'R') {
					answer = 1;
				}
			}
		}
		
		System.out.println(answer);
	}

}
