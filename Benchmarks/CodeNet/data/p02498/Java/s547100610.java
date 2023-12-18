import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static final int BIG_LETTER = 0;
	private static final int LITTLE_LETTER = 1;
	private static final int OTHERS = 2;
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {

		//1ツ行ツづ個禿シツ療債づーツ偲ウツつッツ偲ヲツづゥ
		String input = getInput();
		
		//ツ禿シツ療債づーツ閉ェツ環つオツ閉カツ篠堋療アツδ環スツトツづ可津嘉つキツづゥ
		setInputStrings(input);
		
		//ツ閉カツ篠堋療アツδ環スツトツづ個閉カツ篠堋療アツづ個渉ャツ閉カツ篠堋妥・ツ閉カツ篠堋づーツ禿シツづェツ妥鳴つヲツづゥ
		replaceAllStrings();
		
		//ツ閉カツ篠堋療アツδ環スツトツづ個閉カツ篠堋療アツづーツ出ツ療債つキツづゥ
		printAllInputStrings();
	}
	
	private static String getInput(){
		return sc.nextLine();
	}
	
	private static void setInputStrings(String input){
		String[] strings = input.split(",");
		for(int i = 0; i < strings.length; i++){
			result.add(strings[i]);
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
	
	private static String getReplaceString(String str){
		String resultString = new String();
		for(int i = 0; i < str.length(); i++){
			String c = String.valueOf(str.charAt(i));
			switch(isBigLetter(c.charAt(0))){
			case BIG_LETTER:
				resultString = resultString.concat(c.toLowerCase());
				break;
			case LITTLE_LETTER:
				resultString = resultString.concat(c.toUpperCase());
				break;
			case OTHERS:
				resultString = resultString.concat(c);
				break;
			}
		}
		
		return resultString;
	}
	
	private static void replaceAllStrings(){
		for(int i = 0; i < result.size(); i++){
			String str = getReplaceString(result.get(i));
			result.set(i, str);
		}
	}

	private static void printAllInputStrings(){
		for(int i = 0; i < result.size(); i++){
			System.out.printf("%s", result.get(i));
			if(i < result.size() - 1){
				System.out.printf(",");
			}
		}
		System.out.println();
	}
}