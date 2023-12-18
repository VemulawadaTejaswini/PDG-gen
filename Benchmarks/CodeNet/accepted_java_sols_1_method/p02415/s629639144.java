import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			//入力と同時に文字列を配列arrayに初期化 
			char[] array = scanner.nextLine().toCharArray();
			
			//arrayの要素数繰り返す
			for(char a : array) {
				
				//小文字変換
				if(Character.isUpperCase(a)) {
					
					System.out.print(Character.toLowerCase(a));
				
				//小文字変換
				}else {
					
					System.out.print(Character.toUpperCase(a));			
				}

			}

			System.out.println();		//行送り

	}
}


