import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String C = sc.next();
            System.out.println((char) (C.charAt(0) + 1));
        }
    }
}