import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int c500 = stdin.nextInt();
        int c100 = stdin.nextInt();
        int c50 = stdin.nextInt();
        int cSum = stdin.nextInt();

        int count = 0;

        for (int i = 0; i <= c500; i++) {
            for (int j = 0; j <= c100; j++) {
                for (int k = 0; k <= c50; k++) {
                    if (i * 500 + j * 100 + k * 50 == cSum) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
