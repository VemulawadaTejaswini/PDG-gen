
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> stringDecoded = new ArrayList<String>();
		
		int numLine = Integer.parseInt(br.readLine());
		for(int i = 0; i < numLine; i++){
			String line = br.readLine();
			int[] key = getKey(line);
			stringDecoded.add(decodeString(line, key[0], key[1]));
		}
		
		for(String str : stringDecoded){
			System.out.println(str);
		}
	}
	
	public static String encodeString(String str, int key1, int key2){
		char[] arrayChar = str.toCharArray();
		//a〜zならエンコード
		for(int i = 0; i < arrayChar.length; i++){
			if( 0 <= (arrayChar[i] - 'a') && (arrayChar[i] - 'a') <= 25){
				int codeEncoded = ((arrayChar[i] - 'a') * key1 + key2) % 26;
				arrayChar[i] = (char)(codeEncoded + 'a');
			}
		}
		return String.copyValueOf(arrayChar);
	}
	
	public static String decodeString(String str, int key1, int key2){
		char[] arrayChar = str.toCharArray();
		//a〜zならデコード
		for(int i = 0; i < arrayChar.length; i++){
			int codeEncoded = arrayChar[i]- 'a' - key2;
			if(0 <= (arrayChar[i] - 'a') && (arrayChar[i] - 'a') <= 25){
				while(codeEncoded % key1 != 0){
					codeEncoded += 26;
				}
				int codeDecoded = (codeEncoded / key1) % 26;
				arrayChar[i] = (char)(codeDecoded + 'a');
			}
		}
		return String.copyValueOf(arrayChar);
	}
	
	public static boolean successDecode(String str, int key1, int key2){
		String stringDecoded = decodeString(str, key1, key2);
		if(stringDecoded.indexOf("that") > -1 || stringDecoded.indexOf("this") > -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int[] getKey(String str){
		int[] key = new int[2];
		for(int key1 = 1; key1 <= 25; key1 += 2){
			if(key1 == 13) continue;
			for(int key2 = 0; key2 <= 25; key2++){
				if(successDecode(str, key1, key2)){
					key[0] = key1;
					key[1] = key2;
					return key;
				}
			}
		}
		return key;
	}
}