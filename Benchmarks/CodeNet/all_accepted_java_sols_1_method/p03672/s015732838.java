import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] letters = scanner.nextLine().toCharArray();
		int len = letters.length;
		if (len%2==0) {
			len = len - 2;
		}else{
			len = len - 1;
		}
		
		for (int i = 0; i < letters.length/2-1; i++) {
			char[] c1 = Arrays.copyOfRange(letters, 0, len/2);
			char[] c2 = Arrays.copyOfRange(letters, len/2, len);
			
			if (String.valueOf(c1).equals(String.valueOf(c2))) {
				break;
			}
			len = len - 2;
		}
		System.out.println(len);
		
		scanner.close();
	}
	
}
