import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        if (a % 2 == 0 || b % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
