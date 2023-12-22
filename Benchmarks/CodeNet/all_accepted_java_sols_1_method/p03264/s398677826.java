import java.util.Scanner;

public class Main {
    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int k = Integer.parseInt(input);

        int nOdd = k / 2 + k % 2;
        int nEven = k / 2;
        System.out.print(nOdd * nEven);
    }
}
