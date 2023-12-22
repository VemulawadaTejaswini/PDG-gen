import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//文字列A
		String charStr1 = scan.nextLine();
		//文字列B
		String charStr2= scan.nextLine();

		//文字列Aを一字ごとに格納する配列
		char[] char1 = new char[charStr1.length()];

		//文字列Aを一字ごとに配列に格納
		for(int i = 0 ;i < charStr1.length() ;i++){
			char1[i] = charStr1.charAt(i);
		}

		int result = -1;
		for(int i = 0 ;i < charStr1.length() ;i++){
			String sumChar ="";
			for(int j = 0 ; j < charStr1.length() ;j++){
				//配列の要素をすべてつなげる
				sumChar += String.valueOf(char1[j]);
			}
			//比較し、結果を数字として格納
			result =sumChar.indexOf(charStr2);
			if(result !=-1){
				break;
			}
			//先頭の要素を最後尾にスライドさせる
			for(int j = 0 ; j < charStr1.length()-1 ;j++){
				char charChange = char1[j];
				char1[j] = char1[j+1];
				char1[j+1] = charChange;
			}
		}
		//結果を出力
		if(result != -1 ){
			System.out.println("Yes");
		}else if(result ==-1){
			System.out.println("No");
		}
	scan.close();
	}
}

