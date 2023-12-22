import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        double oneSide = inputInt / 3.0;
        double answer = oneSide * oneSide * oneSide;
        System.out.println(answer);
    }
}