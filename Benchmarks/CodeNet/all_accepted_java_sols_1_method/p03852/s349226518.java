import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(Arrays.asList("a", "e", "i", "o", "u").contains(s) ? "vowel" : "consonant");
	}
}