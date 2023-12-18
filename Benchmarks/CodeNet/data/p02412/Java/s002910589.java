import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            String[] ary = new Scanner(System.in).nextLine().split(" ");
            int n = Integer.parseInt(ary[0]);
            int x = Integer.parseInt(ary[1]);

            if (n == 0 && x == 0) {
                break;
            }

            int counter = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            counter++;
                        }
                    }
                }
            }

            System.out.println(counter);
        }
    }
}