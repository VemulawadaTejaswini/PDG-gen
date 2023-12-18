import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer[] list = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (list[0] - 1 != i && list[1] - 1 != i && list[2] - 1 != i && list[0] + list[1] + (i + 1) <= 20) {
                    count++;
                }
            }
            System.out.println(count > 3 ? "YES" : "NO");

        }
    }
}

