import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Counting Characters
 */
public class Main {
    private static byte[] asciiCodes = new byte[26];
    private static int asc_a = 97;
    private static String alphabet;
    private static int alphabetSize = 26;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        setAsciiCodes();
        String str;
        int [] count = new int[26];

        while (scan.hasNext()) {
            str = scan.nextLine();
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                for (int y = 0; y < alphabetSize; y++) {
                    if (str.substring(i, i+1).equals(alphabet.substring(y, y+1))) {
                        count[y]++;
                    }
                }
            }
        }
        for (int p = 0; p < alphabetSize; p++) {
            System.out.println(alphabet.substring(p, p+1) + " " + ":" + " " + count[p]);
        }
    }

    private static void setAsciiCodes() {
        for (int i = 0; i < alphabetSize; i++) {
            asciiCodes[i] = (byte) asc_a;
            asc_a ++;
        }
        try {
            alphabet = new String(asciiCodes, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}