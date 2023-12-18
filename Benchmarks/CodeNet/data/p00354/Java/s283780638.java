
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        if (X % 7 == 0) {
            System.out.println("thu");
        } else if (X % 7 == 1) {
            System.out.println("fri");
        } else if (X % 7 == 2) {
            System.out.println("sat");
        } else if (X % 7 == 3) {
            System.out.println("sun");
        } else if (X % 7 == 4) {
            System.out.println("mon");
        } else if (X % 7 == 5) {
            System.out.println("tue");
        } else if (X % 7 == 6) {
            System.out.println("wed");

        }
    }
}

