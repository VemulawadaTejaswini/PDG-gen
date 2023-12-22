import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Admin on 2017-08-13.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] tablice = input.next().toCharArray();
        boolean[] tablica = new boolean[26];
        for (int i = 0; i < tablice.length; ++i) {
            char x = tablice[i];
            tablica[x - 'a'] = true;
        }

        for (int i = 0; i < 26; ++i) {
            if (tablica[i] == false) {
                System.out.println((char) (i + 'a'));
                
                return;

            }

        }
        System.out.println("None");
    }
    
}




