import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = a / 500;
        long c = (a - b * 500) / 5;
        System.out.println(b * 1000 + c * 5);
    }

}