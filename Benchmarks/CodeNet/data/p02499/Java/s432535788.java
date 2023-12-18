import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count[] = new int[26];
		for (int i = 0; i < 26; i++){count[i] = 0;}
		char tmp;
		while (true){
			tmp = sc.findInLine(".").charAt(0);
			tmp = Character.toLowerCase(tmp);
			if (tmp == '.') break;
			if (tmp - 'a' >= 0 && 'z' - tmp >= 0){
				count[tmp - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", 'a' + i, count[i]);
		}
	}
}