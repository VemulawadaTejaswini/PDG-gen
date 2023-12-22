
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        int b = 1;
            for (int t = 0;t !=9; t++) {

            for (int i = 0;i != 9; i++) {
                System.out.println(a + "x" + b + "=" + a * b);

                b++;

            }
            b = 1;
            a++;
        }
    }
}
