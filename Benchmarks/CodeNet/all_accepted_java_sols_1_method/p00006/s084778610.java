import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		String str = scan.next();
		for(int i = str.length() - 1; i >= 0; i--){
			char ch = str.charAt(i);
			System.out.printf("%c", ch);
		}
		System.out.printf("\n");
	}
}