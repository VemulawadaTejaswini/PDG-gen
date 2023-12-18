import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            alphabet = alphabet.replace(String.valueOf(c), "");
        }
        if (alphabet.length() == 0) {
            System.out.println("None");
        } else {
            System.out.println(alphabet.charAt(0));
        }
    }

}