import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String text = br.readLine();
	String decryptedText;
	while (text != null) {   
	    while (true) {
		decryptedText = decrypt(text);
		if (decryptedText.contains("the") || decryptedText.contains("this") ||
		    decryptedText.contains("that")) {
		    System.out.println(decryptedText);
		    break;
		}
		text = decryptedText;
	    }
	    text = br.readLine();
	}
    }
    public static String decrypt (String text) {
	char[] ctext = text.toCharArray();
	char letter;
	for (int i = 0; i < ctext.length; i++) {
	    letter = ctext[i];
	    if ('a' <= letter && letter <= 'z') {
	        if ('z' < ++letter) {
		    letter = 'a';
		}
	    }
	    ctext[i] = letter;
	}
	return String.valueOf(ctext);
    }
}