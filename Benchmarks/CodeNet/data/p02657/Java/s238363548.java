import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = nextInt(scanner);
        int b = nextInt(scanner);
        System.out.println(a * b);
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

}



