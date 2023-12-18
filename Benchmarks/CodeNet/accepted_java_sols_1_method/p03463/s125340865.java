import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int spaces = b - a - 1;
        if (spaces % 2 == 0) System.out.println("Borys");
        else System.out.println("Alice");
    }
}
