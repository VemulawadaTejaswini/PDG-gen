import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	String cipherText;
	for (int i = 0; i < n; i++) {
	    cipherText = scan.nextLine();
	    solve(cipherText);
	}
    }
    static void solve (String cipherText) {
	int[] alpa = {1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25};
	for (int i = 0; i < alpa.length; i++) {
	    int a = alpa[i];
	    for (int b = 0; b < 26; b++) {
		if (cipherText.contains(encode("this", a, b)) || cipherText.contains(encode("that", a, b))) {
		    System.out.println(decode(cipherText, a, b));
		    return;
		}
	    }
	}
    }
    
    static String encode (String plainText, int a, int b) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < plainText.length(); i++) {
	    char c = plainText.charAt(i);
	    sb.append((char)((a * (c - 'a') + b) % 26 + 'a'));
	}
	return sb.toString();
    }

    static String decode (String cipherText, int a, int b) {
	StringBuilder sb = new StringBuilder();
	int[] table = new int[26];
	for (int i = 0; i < 26; i++) {
	    int n = (a * i + b) % 26;
	    table[n] = i;
	}
	for (int i = 0; i < cipherText.length(); i++) {
	    char c = cipherText.charAt(i);
	    if (c == ' ') {
		sb.append(c);
	    } else {
		sb.append((char)(table[c - 'a'] + 'a'));
	    }
	}
	return sb.toString();
    }
}