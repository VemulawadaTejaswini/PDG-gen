import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String α = scan.next();

        if (α.matches("[A-Z]")) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
