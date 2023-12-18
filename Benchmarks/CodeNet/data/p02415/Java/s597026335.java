import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//文字列を入力
		String inputChar = scan.nextLine();
		for(int i = 0 ;i < inputChar.length() ;i++ ){
			//文字列のi番目の１文字を格納
			Character oneChar = inputChar.charAt(i);
			//isUpperCaseメソッドの引数がString型のためString型に変換
			String strOneChar = String.valueOf(oneChar);
			//大文字か判別
			//trueなら小文字で出力 falseなら大文字で出力
			if(Character.isUpperCase(oneChar)){
				System.out.print(strOneChar.toLowerCase());
			}else if(Character.isLowerCase(oneChar)){
				System.out.print(strOneChar.toUpperCase());
			}else{
				System.out.print(strOneChar);
			}
		}
		System.out.println("");
	scan.close();
	}
}

