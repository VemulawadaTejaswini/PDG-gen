
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            String name = scanner.next();
            int mae = scanner.nextInt();
            int ato = scanner.nextInt();
            System.out.println(name + " " + (mae + ato) + " " + (mae * 200 + ato * 300));
        }
    }
}

