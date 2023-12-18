import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {
	private static final int BIG_LETTER = 0;
	private static final int LITTLE_LETTER = 1;
	private static final int OTHERS = 2;
	
	private static Scanner sc = new Scanner(System.in);
	private static int[] counter = new int[26];
	private static ArrayList<String> strings = new ArrayList<String>();
	
	public static void main(String[] args) {
		try{
			while(true){
				setInputToStringsList(sc.next());
			}
		}
		catch(NoSuchElementException e){
			countCharactersAll();
			printNumCharacters();
		}
	}
	
	private static void setInputToStringsList(String input){
		strings.add(input);
	}

	private static void countCharacters(String str){
		int num;
		for(int i = 0; i < str.length(); i++){
			switch(isBigLetter(str.charAt(i))){
				case BIG_LETTER:
					String character = String.valueOf(str.charAt(i));
					character = character.toLowerCase();
					num = character.charAt(0) - 'a';
					counter[num]++;
					break;
				case LITTLE_LETTER:
					num = str.charAt(i) - 'a';
					counter[num]++;
					break;
				case OTHERS:
					//At@xbgÈOÌÆ«Í½àµÈ¢
					break;
			}
		}
	}
	
	private static void countCharactersAll(){
		for(int i = 0; i < strings.size(); i++){
			countCharacters(strings.get(i));
		}
	}
	
	private static void printNumCharacters(){
		for(int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", 'a' + i, counter[i]);
		}
	}
	
	private static int isBigLetter(char c){
		if(65 <= c && c <= 90){
			return BIG_LETTER;
		}
		else if(97 <= c &&  c <= 122){
			return LITTLE_LETTER;
		}
		else{
			return OTHERS;
		}
}
}