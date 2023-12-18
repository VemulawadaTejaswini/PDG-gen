import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0 ; i < n ; i++) s[i] = sc.next();
		String word = "";
		for(char c = 'a' ; c <= 'z' ; c++) {
			int min = 10000100;
			for(int i = 0 ; i < n ; i++) {
				int cnt = 0;
				for(int j = 0 ; j < s[i].length() ; j++) {
					if(s[i].charAt(j) == c) cnt++;
				}
				min = Math.min(min, cnt);
			}
			for(int j = 0 ; j < min ; j++) {
				word += c;
			}
		}
		System.out.println(word);
	}
}
