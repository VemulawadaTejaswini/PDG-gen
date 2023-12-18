import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int num2 = num % 10;

        if (num2 == 3) {
            System.out.println("bon");
        } else if (num2 == 0 || num2 == 1 || num2 == 6 || num2 == 8) {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }
}
