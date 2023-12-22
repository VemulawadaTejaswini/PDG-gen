import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();

        char[] removedText = new char[text.length];
        Arrays.fill(removedText, ' ');
        int index = 0;
        int destIndex = -1;
        for (int i = 0; i < text.length; i++) {
            if (destIndex < 0 || text[i] == removedText[destIndex]) {
                removedText[++destIndex] = text[i];
            } else {
                removedText[destIndex--] = ' ';
            }
        }

        System.out.println(new String(text).length() - new String(removedText).trim().length());
    }
}