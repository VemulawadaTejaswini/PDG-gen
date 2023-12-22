
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sentence = "";
		while(sc.hasNext()) {
			sentence += sc.nextLine();
		}

		// アルファベット数格納用
		TreeMap<Character, Integer> countAlph = new TreeMap<>();
		char alphabet = 'a';
		final int ALPHABET_SIZE = 'z' - 'a';
		for(int i=0; i<=ALPHABET_SIZE; i++) {
			countAlph.put(alphabet, 0);
			alphabet++;
		}

		// debug
//		alphabet = 'a';
//		for(int i=0; i<=ALPHABET_SIZE; i++) {
//			System.out.println(String.valueOf(alphabet) + " : " + countAlph.get(alphabet));
//			alphabet++;
//		}

		// アルファベットの数を数える
//		System.out.println(sentence.length());

		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') continue;
			String checkChar = String.valueOf(sentence.charAt(i));
//			System.out.print(checkChar + ", ");
			if(Character.isUpperCase(checkChar.charAt(0))) checkChar = checkChar.toLowerCase();
			// えいじかどうかのはんてい
			Pattern p = Pattern.compile("[a-z]");
			Matcher m = p.matcher(checkChar);
			if(m.find()) countAlph.put(checkChar.toCharArray()[0], countAlph.get(checkChar.toCharArray()[0]) + 1);
		}

		// 出力
		alphabet = 'a';
		for(int i=0; i<=ALPHABET_SIZE; i++) {
			System.out.println(String.valueOf(alphabet) + " : " + countAlph.get(alphabet));
			alphabet++;
		}

		sc.close();

	}

}
