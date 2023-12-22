import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        String str = new Scanner(System.in).nextLine();
        String[] list = str.split(" ");

        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);

        int tmp = 0;

        if (c < b) {
            tmp = b;
            b = c;
            c = tmp;

            if (b < a) {
                tmp = a;
                a = b;
                b = tmp;

                if (c < b) {
                    tmp = b;
                    b = c;
                    c = tmp;

                }
            }

        } else if (b < a) {
            tmp = a;
            a = b;
            b = tmp;

            if (c < b) {
                tmp = b;
                b = c;
                c = tmp;

            }
        }


        System.out.println(a + " " + b + " " + c);





    }

}