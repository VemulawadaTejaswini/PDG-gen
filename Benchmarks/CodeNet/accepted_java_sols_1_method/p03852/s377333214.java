

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowel = "aiueo";

        while (sc.hasNext()) {
            String s = sc.next();
            if (vowel.contains(s)) {
                System.out.println("vowel");
            } else {
                System.out.println("consonant");
            }
        }
    }
}
