import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        str = scanner.nextLine();
        char c = str.charAt(0);
        if (c >=65 && c <= 90) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
