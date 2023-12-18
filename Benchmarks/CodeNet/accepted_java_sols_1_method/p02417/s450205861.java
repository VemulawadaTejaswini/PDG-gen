import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String text = "";
		int num[] = new int[26];

		while(sc.hasNext()) {  //hasNextメソッドはscannerの入力に別のトークンが残っている場合trueを返す
			text += sc.next();
		}

	    text = text.toLowerCase();  //大文字を小文字に変換する

	    for(int i = 0; i < text.length(); i++) {
	    	for(int j = 0; j < 26; j++) {
	    		if(text.charAt(i) == (char)(j+97)) {  //charAt(i)はテキストからi番目の文字を取り出す
	    			num[j]++;
	            }
	        }
		}

		for(int i = 0; i < 26; i++) {
			System.out.println((char)(i + 97) + " : " + num[i]);
		}
	}

}

