import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char s[] = scan.next().toCharArray();
		char t[] = scan.next().toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == t[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}