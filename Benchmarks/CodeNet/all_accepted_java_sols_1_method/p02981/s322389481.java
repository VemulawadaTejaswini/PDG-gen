import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");
        int N = Integer.parseInt(values[0]);
        int A = Integer.parseInt(values[1]);
        int B = Integer.parseInt(values[2]);

        if (N * A >= B) {
            System.out.println(B);
        } else {
            System.out.println(N * A);
        }

        scanner.close();

    }

}
