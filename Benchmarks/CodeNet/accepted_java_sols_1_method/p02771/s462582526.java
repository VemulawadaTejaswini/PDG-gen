
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        String a = values[0];
        String b = values[1];
        String c = values[2];
        if (a.equals(b) && a.equals(c)) {
            System.out.println("No");
        } else {
            if (a.equals(b) || a.equals(c) || b.equals(c)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}