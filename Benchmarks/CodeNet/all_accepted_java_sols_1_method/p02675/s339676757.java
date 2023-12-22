import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int d = n % 10;

        if (d == 3) {
            System.out.println("bon");
        }
        else if (d== 0 || d == 1 || d == 6 || d == 8) {

            System.out.println("pon");
        }
        else {
            System.out.println("hon");
        }
    }


}