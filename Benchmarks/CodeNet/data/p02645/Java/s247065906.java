import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next().substring(0, 3));
    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }


}



