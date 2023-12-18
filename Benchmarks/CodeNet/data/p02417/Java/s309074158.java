import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		char[] str = new char[1200];
		int[] count = new int[26];
		int temp;
		
		
		while (scan.hasNext()) {
			// 入力
			str = scan.next().toCharArray();
			
			// 文字を数える
			for (int i = 0; i < str.length; i++) {
				temp = str[i]-'a' < 0 ? str[i]-'A' : str[i]-'a';
				if (temp >= 0 && temp <= 25) count[temp]++;
			}
		}			
		
		// 出力
		for (int i = 0; i < count.length; i++) {
			System.out.println((char)(i+'a') + " : " + count[i]);
		}
	}
}

