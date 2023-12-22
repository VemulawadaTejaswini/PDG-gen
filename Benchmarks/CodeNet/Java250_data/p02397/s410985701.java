import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int[] array = {a, b};
            Arrays.sort(array);
            String s = "" + array[0] +" "+ array[1];

            System.out.println(s);

        }

    }

}