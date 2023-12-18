import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int[] abc = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                c = Character.toLowerCase(c);
                char cc = 'a';
                for (int j = 0; j < abc.length; j++) {
                    if (cc == c)
                        abc[j]++;
                    cc++;
                }
            }

        char cc = 'a';
        for (int i = 0; i < abc.length; i++) {
            System.out.println(cc + " : " + abc[i]);
            cc++;
        }
    }
}