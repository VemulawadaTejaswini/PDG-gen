
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;

        if (b > a) {
            i = b - (a + w);
        } else if (a > b) {
            i = a - (b + w);
        } else {
            i = 0;
        }
        if (i <= 0) {
            i = 0;
        }
        System.out.println(i);
    }
}
