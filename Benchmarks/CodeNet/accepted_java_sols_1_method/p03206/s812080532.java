import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 25 - sc.nextInt();
        System.out.print("Christmas");
        for (int i = 0; i < d; i++) {
            System.out.print(" Eve");
        }
    }
}