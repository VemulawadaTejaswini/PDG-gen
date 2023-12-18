import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String text;
	String decryptedText;
	int no = 0;
	while (scan.hasNext()) {
	    text = scan.nextLine();
	    while (true) {
		decryptedText = decrypt(text, no);
		if (decryptedText.contains("the") || decryptedText.contains("this") ||
		    decryptedText.contains("that")) {
		    break;
		}
		no++;
	    }
	    System.out.println(decryptedText);
	}
    }
    public static String decrypt (String text, int no) {
	char[] ctext = text.toCharArray();
	char letter;
	for (int i = 0; i < text.length(); i++) {
	    letter = ctext[i];
	    if ('a' <= letter && letter <= 'z') {
		letter = (char)(letter - no);
		if (letter < 97) {
		    letter = (char)(122 + letter - 97);
		}
	    }
	    ctext[i] = (char)letter;
	}
	return String.valueOf(ctext);
    }
}