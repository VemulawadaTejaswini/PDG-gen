import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main (String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String text = br.readLine();
	String decryptedText;
	int no = 0;
	while (text != null) {   
	    while (true) {
		decryptedText = decrypt(text, no);
		if (decryptedText.contains("the") || decryptedText.contains("this") ||
		    decryptedText.contains("that")) {
		    System.out.println(decryptedText);
		    break;
		}
		no++;
	    }
	    text = br.readLine();
	    no = 0;
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