import java.util.Scanner;

/**
 * Created by khrom on 2017/06/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 3; i <= input; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) System.out.print(" " + i);
        }
        System.out.println();
    }
}