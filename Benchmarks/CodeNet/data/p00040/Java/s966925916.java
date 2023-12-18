import java.util.Scanner;


public class Main{
	
	static int[] alpha = new int[] {1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25};
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++){
			System.out.println(decode(sc.nextLine()));
		}
		sc.close();
	}
	
	static int charToInt(char c) {
		return c - 'a';
	}
	
	static char intToChar(int i) {
		return (char) ('a' + i);
	}
	
	static char shiftAffine(int alpha, int beta, char c) {
		int result = (alpha * charToInt(c) + beta) % 26;
		return intToChar(result);
	}
	
	static String shiftAffine(int alpha, int beta, String str) {
		char[] ca = str.toCharArray();
		char[] result = new char[ca.length];
		for(int i = 0; i < ca.length; i++) {
			if(ca[i] >= 'a' && ca[i] <= 'z')
				result[i] = shiftAffine(alpha, beta, ca[i]);
			else result[i] = ca[i];
		}
		return String.valueOf(result);
	}
	
	static String decode(String str) {
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < 26; j++) {
				String result = shiftAffine(alpha[i], j, str);
				if(result.contains("that")) return result;
				if(result.contains("this")) return result;
			}
		}
		return null;
	}
}