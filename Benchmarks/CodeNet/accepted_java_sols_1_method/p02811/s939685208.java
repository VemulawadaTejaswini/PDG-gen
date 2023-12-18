import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int x = scan.nextInt();
        if (500 * k >= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
