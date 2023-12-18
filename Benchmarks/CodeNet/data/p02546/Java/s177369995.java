import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        if (example.endsWith("s")) {
            System.out.println(example + "es");
        } else {
            System.out.println(example + "s");
        }
    }
}
