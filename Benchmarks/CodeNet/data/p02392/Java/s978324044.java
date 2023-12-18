import static java.lang.System.out;
import java.util.Scanner;

public class Lesson1_2_B {
    public static void main(String...args) {
        String str = new Scanner(System.in).nextLine();
        String[] list = str.split(" ");

        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);

        if (b > a && b < c) {
            out.println("Yes");
        }
        else {
            out.println("No");
        }
    }

}