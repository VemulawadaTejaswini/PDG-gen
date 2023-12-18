import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();

        if ("a".equals(c) || "i".equals(c)
                || "u".equals(c) || "e".equals(c)
                || "o".equals(c)) {
            System.out.println("vowel");
            return;
        }
        System.out.println("consonant");
    }

}
