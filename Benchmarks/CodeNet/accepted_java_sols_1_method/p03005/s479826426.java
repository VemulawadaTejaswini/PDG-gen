import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int balls = input.nextInt();
        int people = input.nextInt();

        if (people == 1) {
            System.out.println(0);
        } else {
            System.out.println(balls - people);
        }
    }
}
