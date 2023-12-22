import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int s = n % 10;
        if( s == 2 || s == 4 || s == 5 || s == 7 || s == 9 ) {
            System.out.println("hon");
        }else if( s == 0 || s == 1 || s == 6 || s == 8) {
            System.out.println("pon");
        }else if( s == 3) {
            System.out.println("bon");
        }

        scanner.close();

    }

}