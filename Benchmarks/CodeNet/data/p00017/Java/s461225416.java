
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static final int MIN_NUM_SHIFT = 1;
	private static final int MAX_NUM_SHIFT = 25;
	
	private static final int NOT_INCLUDE = -1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> results = new ArrayList<String>();
		
		try{
			while(true){
				results.add(decryptString(sc.nextLine()));
			}
		}catch(NoSuchElementException e){
			//½àµÈ¢
		}
		
		for(int i = 0; i < results.size(); i++){
			System.out.println(results.get(i));
		}
		
	}
	
	//Ã¶ñð¡»µ½¶ñðæ¾·é
	public static String decryptString(String target){
		String result = target;
		for(int i = MIN_NUM_SHIFT; i <= MAX_NUM_SHIFT ; i++){
			String stringCandidate = shiftString(result, i * (-1));
			if(includeKeywords(stringCandidate)){
				result = stringCandidate;
			}
		}
		return result;
	}
	
	//ÎÛ¶ñÌAt@xbgðwè³ê½¸çµ½¶ñzñðæ¾·é
	public static String shiftString(String target, int numShift){
		char[] result = target.toCharArray();
		for(int i = 0; i < target.length(); i++){
			if(isAlphabet(result[i])){
				int code = (int)result[i] + numShift;
				result[i] = (char)code;
			}
		}
		return String.copyValueOf(result);
	}
	
	private static boolean includeKeywords(String target){
		if(target.indexOf("the") != NOT_INCLUDE){
			return true;
		}
		if(target.indexOf("this") != NOT_INCLUDE){
			return true;
		}
		if(target.indexOf("that") != NOT_INCLUDE){
			return true;
		}
		return false;
	}
	
	private static boolean isAlphabet(char c){
		if(97 <= c && c <= 122){
			return true;
		}
		else{
			return false;
		}
	}
}