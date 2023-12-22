
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = 0;

        while (w != 7) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a - b);
            w++;
        }

    }
}

