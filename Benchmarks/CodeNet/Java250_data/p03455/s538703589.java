import java.util.Scanner;

public class Main {
    /**
     * Product
     * @param 1 ≤ a,b ≤ 10000
     */
    public static void main(String...args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a * b % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}