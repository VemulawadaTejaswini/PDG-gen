import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] letters = str.toCharArray();
		for(char c:letters) {
			if(c-3<'A') {
				System.out.printf("%c",c+23);
			}else {
				System.out.printf("%c",c-3);
			}
		}
		System.out.println();
		
	}
}

