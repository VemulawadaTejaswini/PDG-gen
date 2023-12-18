
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long l = 1;

        for (int i = 0; i < N; i++) {
            l *= sc.nextLong();
            if (l > 1000000000000000000L) {
                l = -1;
                while (sc.hasNext()) {
                    if (sc.nextLong() == 0) {
                        l = 0;
                        break;
                    }
                }
                break;
            }
        }

        System.out.println(l);
        sc.close();

    }
}