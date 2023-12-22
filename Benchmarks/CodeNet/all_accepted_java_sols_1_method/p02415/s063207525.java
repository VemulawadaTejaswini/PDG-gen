
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chars = sc.nextLine().toCharArray();
		for(int i  = 0; i < chars.length; i++){
			char c = chars[i];
			if('a' <= c && c <= 'z'){
				chars[i] = (char)(c - 32);
			}
			if('A' <= c && c <= 'Z'){
				chars[i] = (char)(c + 32);
			}
		}
		System.out.println(chars);
	}
}

