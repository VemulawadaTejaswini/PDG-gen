import java.util.Scanner;

/**
 * Trick or Treat.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var k = scanner.nextInt();

        var people = new int[n];
        for (int i = 0; i < k; i++) {
            var d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                people[scanner.nextInt() - 1]++;
            }
        }

        var tricked = 0;
        for (int person : people) {
            if (person == 0) {
                tricked++;
            }
        }
        System.out.println(tricked);
    }
}
