import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.next());
            System.out.println(n <= m ? "Yes" : "No");
        }
    }

}
