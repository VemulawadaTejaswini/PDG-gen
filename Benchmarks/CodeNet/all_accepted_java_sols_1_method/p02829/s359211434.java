import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner lol = new Scanner(System.in)) {
            final int a = lol.nextInt();
            final int b = lol.nextInt();

            System.out.println(6 - a - b);
        }
    }
}