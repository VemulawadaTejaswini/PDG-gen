import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		
		for(char c : input.toCharArray()){
			System.out.print(('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') ? (char) (c ^ ('a' - 'A'))  : c);
		}
		System.out.println();
	}

}