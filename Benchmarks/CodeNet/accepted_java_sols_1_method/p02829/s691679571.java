import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String wrongA;
        String wrongB;

        Scanner scanner = new Scanner(System.in);
        wrongA = scanner.nextLine();
        wrongB = scanner.nextLine();
        scanner.close();

        if (!"1".equals(wrongA) && !"1".equals(wrongB)) {
            System.out.println("1");
        } else if (!"2".equals(wrongA) && !"2".equals(wrongB)) {
            System.out.println("2");
        } else if (!"3".equals(wrongA) && !"3".equals(wrongB)) {
            System.out.println("3");
        }

    }
}