import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] input = readInput();
        int a = input[0];
        int b = input[1];
        int c = input[2];

        if (a < b && b < c) {
            System.out.printf("%d %d %d\n", a, b, c);
        } else if (a < c && c < b) {
            System.out.printf("%d %d %d\n", a, c, b);
        } else if (b < a && a < c) {
            System.out.printf("%d %d %d\n", b, a, c);
        } else if (b < c && c < a) {
            System.out.printf("%d %d %d\n", b, c, a);
        } else if (c < a && a < b) {
            System.out.printf("%d %d %d\n", c, a, b);
        } else { // c < b < a
            System.out.printf("%d %d %d\n", c, b, a);
        }
    }


    public static Integer[] readInput() {
        List<Integer> l = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            l.add(sc.nextInt());
        }
        return l.toArray(new Integer[l.size()]);
    }
}