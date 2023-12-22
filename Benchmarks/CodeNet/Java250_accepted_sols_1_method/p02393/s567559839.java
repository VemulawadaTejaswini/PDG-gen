
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b > c) {
            // b と c　を入れ替える
            x = b;
            b = c;
            c = x;
        }
        if (a > b) {
            //a と b　を入れ替える
            x = a;
            a = b;
            b = x;
        }
        if (b > c) {
            // b と c　を入れ替える
            x = b;
            b = c;
            c = x;
        }
        System.out.println(a+" "+b+" "+c);
    }
}

