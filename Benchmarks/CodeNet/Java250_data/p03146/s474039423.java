import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int prev = reader.nextInt();
        reader.close();
        Set<Integer> numbers = new HashSet<>();
        int i = 1;
        do {
            ++i;
            numbers.add(prev);
            prev = f(prev);
        } while (!numbers.contains(prev));
        System.out.println(i);
    }

    private static int f(int n) {
        return n % 2 == 0 ? n / 2 : 3 * n + 1;
    }
}