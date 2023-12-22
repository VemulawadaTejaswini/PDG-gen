import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        String str = scanner.next();

        char[] alphabet = new char[26];
        char c = 'A';

        for(int i = 0; i < 26; i++) {
            alphabet[i] = c++;
        }

        String answer = new String();
        for(int i =0 ; i < str.length(); i++) {
            for(int k =0; k < alphabet.length; k++) {
                if(str.charAt(i) == alphabet[k]) {
                    int kekka = (k+n) - (26 * ((k+n) / 26));
                    answer += alphabet[kekka];
                }
            }
        }
        System.out.println(answer);
    }
}