import java.util.Scanner;

/**
 * 1%.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var x = Long.parseLong(scanner.next());

        var deposit = 100L;
        var year = 0;
        while (deposit < x) {
            deposit += deposit * 0.01;
            year++;
        }
        System.out.println(year);
    }
}
