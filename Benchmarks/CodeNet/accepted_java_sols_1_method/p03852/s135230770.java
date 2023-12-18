import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        if ("a".equals(s) || "i".equals(s) || "u".equals(s) || "e".equals(s) || "o".equals(s)) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
