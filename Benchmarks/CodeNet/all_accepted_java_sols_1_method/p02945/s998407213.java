import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] token = line.split(" ");
        int a = Integer.parseInt(token[0]);
        int b = Integer.parseInt(token[1]);

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;

        int max = Math.max(sum, Math.max(diff, mul));

        System.out.println(max);
    }

}