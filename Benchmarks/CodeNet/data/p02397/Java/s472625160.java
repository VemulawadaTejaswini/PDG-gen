
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();     

        while (x != 0 ||y!= 0) {
            if (x > y) {
                System.out.println(y + " " + x);
            }
            if (x < y) {
                System.out.println(x+ " "+y);
            }
            if (x == y) {
                System.out.println(x + " " + y);
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }
    }
}

