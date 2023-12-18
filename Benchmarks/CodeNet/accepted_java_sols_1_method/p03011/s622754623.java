import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);


        final int ab = scanner.nextInt();
        final int bc = scanner.nextInt();
        final int ca = scanner.nextInt();

        System.out.println(Math.min(Math.min(ab + bc, bc + ca), ca + ab));                
    }
}