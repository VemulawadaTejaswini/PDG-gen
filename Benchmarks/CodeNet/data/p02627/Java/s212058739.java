public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		char AlphabetU = 'B';
		//char AlphabetL = 'a';
		
		discernAlphabetic(AlphabetU);
		//discernAlphabetic(AlphabetL);
	}
	
	private static void discernAlphabetic(char Alphabet) {
		if (Character.isUpperCase(Alphabet)) {
			System.out.println("A");	// 大文字
		}
		else {
			System.out.println("a");	// 小文字
		}
	}
}
