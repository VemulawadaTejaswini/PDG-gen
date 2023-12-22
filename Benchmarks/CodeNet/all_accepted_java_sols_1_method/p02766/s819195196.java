
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = 0;
        for (int i = 0 ; i < 100 ; i++) {
            if (n > 0) {
                c++;
                n /= k;
            }
        }
        System.out.println(c);
    }

}
