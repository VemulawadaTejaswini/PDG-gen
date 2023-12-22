import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println((sc.nextInt() - 1) * (sc.nextInt() - 1));
        }
    }
}
