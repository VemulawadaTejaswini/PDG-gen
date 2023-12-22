import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int i=0;
        for (;;) {
            n /= k;
            i++;
            if (n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}