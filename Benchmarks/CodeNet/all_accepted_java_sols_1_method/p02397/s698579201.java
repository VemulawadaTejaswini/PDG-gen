import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] a = new int[]{sc.nextInt(), sc.nextInt()};
            if (a[0] == 0 && a[1] == 0) {
                break;
            }
            Arrays.sort(a);
            System.out.println(a[0] + " " + a[1]);
        }
    }
}