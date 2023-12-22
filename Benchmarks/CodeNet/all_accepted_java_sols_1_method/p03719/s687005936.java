import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());

        scanner.close();
        
        if (C >= A && C<= B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
