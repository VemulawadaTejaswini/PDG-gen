import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        char[] S = scanner.next().toCharArray();
        scanner.close();

        int x = 0;
        int max = 0;

        for (char c : S) {
            if (c == 'I') x++;
            if (c == 'D') x--;

            if (x > max) max = x;
        }

        System.out.println(max);
    }
}
