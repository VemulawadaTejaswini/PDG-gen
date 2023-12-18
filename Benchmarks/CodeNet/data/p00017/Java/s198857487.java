
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final int MIN_NUM_SHIFT = 1;
	private static final int MAX_NUM_SHIFT = 25;
	
	private static final int NOT_INCLUDE = -1;
	
	private static final String[] KEYWORD = {"the","this","that"};

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		while((input = br.readLine()) != null){
			System.out.println((decryptString(input)));
		}
	}
	
	//暗号文字列を複合化した文字列を取得する
	public static String decryptString(String target){
		String result = target;
		for(int i = MIN_NUM_SHIFT; i <= MAX_NUM_SHIFT ; i++){
			String stringCandidate = shiftString(result, i * (-1));
			if(includeKeywords(stringCandidate)){
				result = stringCandidate;
				break;
			}
		}
		return result;
	}
	
	//対象文字列のアルファベットを指定された数ずらした文字列配列を取得する
	public static String shiftString(String target, int numShift){
		char[] result = target.toCharArray();
		for(int i = 0; i < target.length(); i++){
			if(isAlphabet(result[i])){
				int code = (int)result[i] + numShift;
				code = checkAndFixCode(code);
				result[i] = (char)code;
			}
		}
		return String.copyValueOf(result);
	}
	
	private static boolean includeKeywords(String target){
		for(String keyword : KEYWORD){
			if(target.indexOf(keyword) > NOT_INCLUDE){
				return true;
			}
		}
		return false;
	}
	
	private static boolean isAlphabet(char c){
		if('a' <= c && c <= 'z'){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static int checkAndFixCode(int code){
		if(code > 'z'){
			return 'a' + code - 'z' - 1;
		}
		if(code < 'a'){
			return 'z' - 'a' + code - 1;
		}
		return code;
	}
}