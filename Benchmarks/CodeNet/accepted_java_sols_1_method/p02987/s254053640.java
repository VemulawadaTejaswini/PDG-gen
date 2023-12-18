import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] alphabet = new char[26];
		for (int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i)-'A']++;
		}		
		boolean flag = false;
		for (int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == 1) {
				flag = true;
			}else if(alphabet[i] == 4) {
				flag = true;
			}
		}
		System.out.println((flag)?"No":"Yes");
	}

}
