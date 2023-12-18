import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double menseki = a * a * 3.14159 / 4;
        double enshuu = a * 3.14159;
        System.out.println(menseki + " " + enshuu);
    }
}