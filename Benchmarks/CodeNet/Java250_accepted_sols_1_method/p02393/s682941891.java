import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] array = {a, b, c};
        Arrays.sort(array);
        String s=""+array[0]+" "+array[1]+" "+array[2];
        System.out.println(s);
    }
}