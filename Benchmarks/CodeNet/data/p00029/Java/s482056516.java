
import java.util.Scanner;

public class Main {
	private static String[] str;
	
	public static void main(String[] args) {
		setInput();
		System.out.println(str[getIndexMaxNumSameWords()] + " " + str[getIndexLongestWord()]);
	}
	
	public static void setInput(){
		String input = getLine();
		str = input.split(" ");
	}
	
	private static String getLine(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		return str;
	}
	
	public static int getIndexLongestWord(){
		int index = 0;
		int maxLength = str[index].length();
		for(int i = 1; i < str.length; i++){
			if(maxLength < str[i].length()){
				maxLength = str[i].length();
				index = i;
			}
		}
		return index;
	}
	
	private static int getNumSameWords(int index){
		int numSameWord = 0;
		for(int i = 0; i < str.length; i++){
			if(str[index].compareToIgnoreCase(str[i]) == 0){
				numSameWord++;
			}
		}
		return numSameWord;
	}
	
	public static int getIndexMaxNumSameWords(){
		int index = 0;
		int maxSameWords = 0;
		for(int i = 0; i < str.length; i++){
			if(maxSameWords < getNumSameWords(i)){
				maxSameWords = getNumSameWords(i);
				index = i;
			}
		}
		return index;
	}
	
	public static String getStr(int index) {
		return str[index];
	}
	
	public static void setStr(String[] str) {
		Main.str = str;
	}
}