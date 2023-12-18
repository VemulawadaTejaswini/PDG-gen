import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] inputStr = br.readLine().toCharArray();
		int wordsNum = Integer.parseInt(br.readLine());
		
		HashMap<Integer, ArrayList<Pattern>> arrayMap = new HashMap<Integer, ArrayList<Pattern>>();
		for(int i = 1; i <= 3000 ; i++){
			arrayMap.put(i, new ArrayList<Pattern>());
		}
		
		Pattern[] patterns = new Pattern[wordsNum];
		for(int i = 0; i < wordsNum ; i++){
			char[] pattern = br.readLine().toCharArray();
			//int index = RKSearcher.indexOf(pattern, inputStr);
//			int index = BMSearcher.indexOf(inputStr, pattern);
//			if(index != -1){
//				System.out.println(1);
//			}
//			else{
//				System.out.println(0);
//			}
			Pattern tmpPattern = new Pattern(pattern);
			patterns[i] = tmpPattern;
			arrayMap.get(pattern.length).add(tmpPattern);
		}
		//System.out.println("MapSize "+arrayMap.size());
		for(int i = 1; i <= arrayMap.size() ; i++){
			//System.out.println("i = "+i);
			ArrayList<Pattern> tmplist = arrayMap.get(i);
			if(tmplist.size() > 0){
				//System.out.println("size "+tmplist.size());
				RKSearcher.indexOf(tmplist, inputStr);
			}
		}
		
		for(int i = 0; i < wordsNum ; i++){
			if(patterns[i].exist){
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}

}

class Pattern {
	char[] pattern;
	boolean exist;
	
	public Pattern (char[] pattern){
		this.pattern = Arrays.copyOf(pattern, pattern.length);
		this.exist = false;
	}
}

class RKSearcher {
	private static final long q = 1000000007L;
	private static final int d = 64;
	
	public static void indexOf(ArrayList<Pattern> pattern, char[] str2){
		int M = pattern.get(0).pattern.length;
		int N = str2.length;
		int patternNum = pattern.size();
		long dM = 1;
		long[] h1 = new long[patternNum];
		long h2 = 0;
		
		//?????????????????°???????????????equals???????????°??????
		if(M == N){
			for(int i = 0 ; i < patternNum ; i++){
				Pattern tmpPtn = pattern.get(i);
				if(new String(tmpPtn.pattern).equals(new String(str2))){
					tmpPtn.exist = false;
				}
				else {
					tmpPtn.exist = true;
				}
			}
			
			return;
		}
		
		else if (M > N){
			return;
		}
		
		for(int i = 1; i < M ; i++){
			dM = (d*dM)%q;
		}
		
		for(int i = 0; i < M; i++){
			
			h2 = (h2*d + index(str2[i])) % q;
		}
		
		for(int j = 0; j < patternNum ; j++){
			for(int i = 0; i < M; i++){
				h1[j] = (h1[j]*d + index(pattern.get(j).pattern[i])) % q;
			}
			if(h1[j] == h2){
				pattern.get(j).exist = true;
			}
//			System.out.println("hash for "+new String(pattern.get(j).pattern) + " is "+h1[j]);
		}
	//	System.out.println("first h2 "+h2);
		
		int i;
		int matched = 0;
		for(i = 0; i < N ;i++){
			//System.out.println("i = "+i+" h1 "+h1+" h2 "+h2);
			h2 = (h2 + d*q - index(str2[i])*dM) % q;
			if(i+M >= N){
				return;
			}
			h2 = (h2*d + index(str2[i+M])) % q;
			if (i > N-M){
				return;
			}
			for(int j = 0; j < patternNum ; j++){
				
				if(h1[j] == h2){
					Pattern tmpPtn = pattern.get(j);
//					System.out.println("HIT "+new String(tmpPtn.pattern));
					if(tmpPtn.exist == false){
						tmpPtn.exist = true;
						matched++;
					}
				}
//				else{
//					System.out.println("UNMATCH "+new String(pattern.get(j).pattern));
//				}
			}
			
			if(matched == patternNum){
				break;
			}
			
		}
		return;
	}
	
	public static int indexOf(char[] str1, char[] str2){
		int M = str1.length;
		int N = str2.length;
		long dM = 1;
		long h1 = 0;
		long h2 = 0;
		
		//?????????????????°???????????????equals???????????°??????
		if(M == N){
			if(new String(str1).equals(new String(str2))){
				return 0;
			}
			else {
				return -1;
			}
		}
		
		else if (M > N){
			return -1;
		}
		
		for(int i = 1; i < M ; i++){
			dM = (d*dM)%q;
		}
		
		for(int i = 0; i < M; i++){
			h1 = (h1*d + index(str1[i])) % q;
			h2 = (h2*d + index(str2[i])) % q;
		}
		int i;
		for(i = 0; h1 != h2 ;i++){
			//System.out.println("i = "+i+" h1 "+h1+" h2 "+h2);
			h2 = (h2 + d*q - index(str2[i])*dM) % q;
			if(i+M >= N){
				return -1;
			}
			h2 = (h2*d + index(str2[i+M])) % q;
			if (i > N-M){
				return -1;
			}
		}
		return i;
	}
	
	private static int index(char c){
		//return c - '0' + 1;
		//??°??????0~9
		if(c >=  '0' && c <= '9'){
			return c - '0';
		}
		//?°??????????10~35
		else if (c >= 'a' && c <= 'z'){
			return c - 'a' + 10;
		}
		//??§?????????36~61
		else if (c >= 'A' && c <= 'Z'){
			return c - 'A' + 36;
		}
		else {
			return -1;
		}
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