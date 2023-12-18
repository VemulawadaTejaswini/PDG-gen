import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,s,e;
		String word;
		int[] letter;
		boolean flag;
		
		for(;;) {
			n = sc.nextInt();
			if(n == 0) {
				break;
			}
			
			letter = new int[26];
			flag = true;
			
			for(int i=0; i<n; i++) {
				word = sc.next();
				letter[word.charAt(0) - 97] ++;
				letter[word.charAt(word.length()-1) - 97] --;
			}
			
			for(int i=0; i<26; i++) {
				if(letter[i] != 0) {
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
			
		}
	}
}