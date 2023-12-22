import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int x = Integer.parseInt(scanner.next());
        int[] children = new int[N];
        for (int i = 0; i < N; i++) {
            children[i] = Integer.parseInt(scanner.next());
        }
        scanner.nextLine();

        Arrays.sort(children);

        int happyChildren = 0;
        for (int i = 0; i < N; i++) {
            int num = children[i];
            if (i == N - 1 && num == x) {
                happyChildren++;
            } else if (i != N - 1 && x >= num) {
                happyChildren++;
                x -= num;
            }
        }

        System.out.println(happyChildren);
    }
}
