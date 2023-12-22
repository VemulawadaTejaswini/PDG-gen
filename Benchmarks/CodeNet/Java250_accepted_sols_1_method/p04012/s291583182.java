import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		char[] c = w.toCharArray();
		int[] alph = new int[26];
		boolean result = true;

		for(int i=0;i<w.length();i++) {
			alph[(int)(c[i]-'a')]++;
		}

		for(int i=0;i<26;i++) {
			if(alph[i]%2!=0) result=false;
		}

		if(result) System.out.println("Yes");
		else System.out.println("No");
		scanner.close();
	}

}
