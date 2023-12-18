import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int R = sc.nextInt();
            System.out.println(2 * Math.PI * R);
        }
    }
}
