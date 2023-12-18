import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int[] abc = new int[26];

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            char a = 'a';
            c = Character.toLowerCase(c);
            for (int j = 0; j < abc.length; j++) {
                if (c == a) abc[j]++;
                a++;
            }
        }

        char c = 'a';
        for (int i = 0; i < abc.length; i++) {
            System.out.println(c + " : " + abc[i]);
            c++;
        }
    }
}