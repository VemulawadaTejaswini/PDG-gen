import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c = scanner.next();
        String[] s = new String[] {"a", "i", "u", "e", "o"};
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            if(c.equals(s[i]))ans = 1;
        }
        if(ans == 1){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }

    }
}


