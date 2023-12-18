
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;
        int x = 0;
        while (n > x) {
            int s = scanner.nextInt();
            int f = scanner.nextInt();
            if( !(a >= f || b <= s) ){
                result = 1;
            }
            x++;
        }
        System.out.println(result);
    }
}

