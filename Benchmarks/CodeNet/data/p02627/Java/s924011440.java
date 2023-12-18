import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("a");
        } else {
            System.out.println("A");
        }
    }
}