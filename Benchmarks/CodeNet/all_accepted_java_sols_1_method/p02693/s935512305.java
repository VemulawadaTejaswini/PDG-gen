import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int param = scan.nextInt();

        int from = scan.nextInt();
        int to = scan.nextInt();

        boolean is = false;

        for (int i = from; i <= to; i++) {
            if (i % param == 0) {
                is = true;
            }
        }

        if (is) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
