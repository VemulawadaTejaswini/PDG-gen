
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d;
        if (a > b) {
            // a(=X) と b(=Y)　を交換
            d = a;
            a = b;
            b = d;
        }
        if (b > c) {
            // b と c　を交換
            d = b;
            b = c;
            c = d;
        }
        if (a > b) {
            // a と b　を交換
            d = a;
            a = b;
            b = d;
        }
        System.out.println(a + " " + b + " " + c);
    }
}

