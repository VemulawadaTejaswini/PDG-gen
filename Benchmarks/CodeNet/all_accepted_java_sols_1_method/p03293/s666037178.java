

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
            System.out.println("Yes");
            return;
        }
        char[] charA = a.toCharArray();
        for (int j = 0; j < charA.length; j++) {
            char temp = charA[0];
            for (int i = 0; i < charA.length - 1; i++) {
                charA[i] = charA[i + 1];
            }
            charA[charA.length - 1] = temp;
            if (b.equals(String.valueOf(charA))) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
