import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        char letterAsChar = letter.charAt(0);
        System.out.println(++letterAsChar);
    }
}