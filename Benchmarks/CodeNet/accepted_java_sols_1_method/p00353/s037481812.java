import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int f = scan.nextInt();
        int b = scan.nextInt();
        scan.nextLine();

        scan.close();

        if (m >= b) {
            System.out.println(0);
        } else if (m + f >= b) {
            System.out.println(b - m);
        } else {
            System.out.println("NA");
        }
    }
}
