import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long l = 1;

        for (int i = 0; i < N; i++) {

            long inputLong = sc.nextLong();

            if (1000000000000000000L / l < inputLong) {
                l = -1;
                while (sc.hasNext()) {
                    if (sc.nextLong() == 0) {
                        l = 0;
                        break;
                    }
                }
                break;
            }

            l *= inputLong;

        }

        System.out.println(l);
        sc.close();

    }
}
