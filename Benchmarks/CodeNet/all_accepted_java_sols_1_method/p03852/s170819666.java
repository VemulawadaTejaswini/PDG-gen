import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();

        c = c.replaceAll("a", "");
        c = c.replaceAll("i", "");
        c = c.replaceAll("u", "");
        c = c.replaceAll("o", "");
        c = c.replaceAll("e", "");

        if (c.length() == 0) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

    }
}