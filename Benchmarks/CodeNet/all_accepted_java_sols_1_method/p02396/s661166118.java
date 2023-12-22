
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int coint = 1;
        int x = scan.nextInt();
        while (x != 0) {
            System.out.println("Case " + coint + ": " + x);
            x = scan.nextInt();
            coint = coint + 1;
        }
    }
}

