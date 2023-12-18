
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int sum = (a + b);
            int count = 0;
            do {
                sum /= 10;
                count++;
            } while (sum > 0);
            System.out.println(count);
        }
    }
}

