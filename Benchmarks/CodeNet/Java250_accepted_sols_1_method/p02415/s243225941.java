import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] text = sc.nextLine().toCharArray();
		
		for(int i=0; i<text.length; i++) {
			if(Character.isUpperCase(text[i])) {
				text[i] = Character.toLowerCase(text[i]);
			} else {
				text[i] = Character.toUpperCase(text[i]);
			}
		}
		
		System.out.println(text);
	}

}