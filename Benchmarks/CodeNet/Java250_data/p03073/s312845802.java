import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] charArray = input.toCharArray();
        int length = charArray.length;

        char[] shiroKuro = new char[length];
        char[] kuroShiro = new char[length];
        for (int i=0; i<length; i++) {
            if (i % 2 == 0) {
                shiroKuro[i] = '0';
                kuroShiro[i] = '1';
            } else {
                shiroKuro[i] = '1';
                kuroShiro[i] = '0';
            }
        }

        int shiroKuroCount = 0;
        int kuroShiroCount = 0;

        for (int i=0; i<length; i++) {
            if (charArray[i] != shiroKuro[i]) {
                shiroKuroCount++;
            }

            if (charArray[i] != kuroShiro[i]) {
                kuroShiroCount++;
            }
        }

        System.out.println(Math.min(shiroKuroCount, kuroShiroCount));
    }
}
