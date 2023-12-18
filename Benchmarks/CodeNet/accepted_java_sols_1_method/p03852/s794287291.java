import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";
        if (word.equals("a") | word.equals("i") |word.equals("u") |word.equals("e") |word.equals("o")) {
            result = "vowel";
        } else {
            result = "consonant";
        }
        System.out.println(result);
    }
}