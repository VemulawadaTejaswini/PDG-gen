import java.util.Scanner;


// 137_b
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int x = scan.nextInt();

        for (int i = 1; i <= 2 * k - 1; i++) {
            System.out.print(x - k + i);
            if (!(i == 2 * k - 1)) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

}
