import java.util.*;

public class Main { // Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int nOperations = string.length() - 1;
		for(char c = 'a'; c <= 'z'; c ++) {
			int max = 0;
			int n = 0;
			for(int i = 0; i < string.length(); i ++) {
				if(string.charAt(i) == c) {
					n = 0;
				} else {
					n ++;
					max = Math.max(max, n);
				}
			}
			nOperations = Math.min(nOperations, max);
		}
		System.out.println(nOperations);
		
		scanner.close();
	}
		
}