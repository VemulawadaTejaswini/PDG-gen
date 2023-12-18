import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int h = Integer.parseInt(tmpArray[0]);
		int w = Integer.parseInt(tmpArray[1]);

		char[][] matrix = new char[h][w];
		
		for(int i = 0; i < h; i++){
			String tmpStr = br.readLine();
			for(int j = 0; j < w; j++){
				matrix[i][j] = tmpStr.charAt(j);
			}
		}

		tmpArray = br.readLine().split(" ");
		int r = Integer.parseInt(tmpArray[0]);
		int c = Integer.parseInt(tmpArray[1]);

		char[][] pattern = new char[r][c];
		for(int i = 0; i < r; i++){
			String tmpStr = br.readLine();
			for(int j = 0; j < c; j++){
				pattern[i][j] = tmpStr.charAt(j);
			}
		}
		
		//??¢?´¢????§?
		for(int i = 0; i + r <= h ; i++){
			char[] str1char = Arrays.copyOf(matrix[i], w);
			char[] str2char = Arrays.copyOf(pattern[0], c);
			int sumOfIndex = 0;
			while(true){
				//System.out.println("str1 " + new String(str1char) + "str2 "+ new String(str2char));
				int index = BMSearcher.indexOf(str1char, str2char);
				
				if(index == -1){
					break;
				}
				
				sumOfIndex += index;
				//System.out.println(sumOfIndex);
				if(isMatch(matrix, pattern, i, sumOfIndex)){
					System.out.println(i+" "+sumOfIndex);
				}
				
				str1char = Arrays.copyOfRange(str1char, index + 1, str1char.length);
				sumOfIndex++;
				if(str1char.length == 0 || str1char.length < str2char.length){
					break;
				}
				
			}
			
		}
	}
	
	static boolean isMatch(char[][] matrix, char[][] pattern, int y, int x){
		for(int i = y; i < y + pattern.length ; i++){
			for(int j = x; j < x + pattern[0].length ; j++){
				if(matrix[i][j] != pattern[i - y][j - x]){
					return false;
				}
			}
		}
		return true;
	}

}

class BMSearcher {
	public static int indexOf(char[] str1, char[] str2){
		if (str2.length == 0){
			return 0;
		}
		
		int charTable[] = makeCharTable(str2);
		int offsetTable[] = makeOffsetTable(str2);
		for(int i = str2.length - 1, j; i < str1.length ;){
			for(j = str2.length - 1; str2[j] == str1[i] ; i--, j--){
				if(j == 0){
					return i;
				}
			}
			
			i += Math.max(offsetTable[str2.length - 1 - j], charTable[str1[i]]);
			
		}
		return -1;
	}
	
	private static int[] makeCharTable(char[] str) {
		final int ALPHABET_SIZE = 256;
		int[] table = new int[ALPHABET_SIZE];
		for(int i = 0; i < table.length ; i++){
			table[i] = str.length;
		}
		for(int i = 0; i < str.length - 1; i++){
			table[str[i]] = str.length - 1 - i;
		}
		return table;
	}
	
	private static int[] makeOffsetTable(char[] str){
		int[] table = new int[str.length];
		int lastPrefixPosition = str.length;
		for(int i = str.length - 1; i >= 0; i--){
			if(isPrefix(str, i + 1)) {
				lastPrefixPosition = i + 1;
			}
			table[str.length - 1 - i] = lastPrefixPosition - i + str.length - 1;
		}
		for(int i = 0; i < str.length - 1; i++){
			int slen = suffixLength(str, i);
			table[slen] = str.length - 1 - i + slen;
		}
		return table;
	}
	
	private static boolean isPrefix(char[] str, int p){
		for (int i = p, j = 0; i < str.length; i++, j++){
			if(str[i] != str[j]){
				return false;
			}
		}
		return true;
	}
	
	private static int suffixLength(char[] str, int p){
		int len = 0;
		for(int i = p, j = str.length - 1;
				i >= 0 && str[i] == str[j]; i--, j--){
			len += 1;
		}
		return len;
	}
}