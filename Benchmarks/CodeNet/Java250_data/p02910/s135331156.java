import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        for (int i = 0; i < word.length(); i++) {
            if ((i + 1) % 2 == 0) {
                if (word.charAt(i) == 'R') {
                    System.out.println("No");
                    return;
                }
            } else {
                if (word.charAt(i) == 'L') {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
