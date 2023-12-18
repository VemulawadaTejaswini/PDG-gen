import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static int getInt(){
        return Integer.parseInt(scanner.next());
    }
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int a = getInt();
        int b = getInt();
        System.out.println(a * b + " " + (2 * a + 2 * b));
    }
}

