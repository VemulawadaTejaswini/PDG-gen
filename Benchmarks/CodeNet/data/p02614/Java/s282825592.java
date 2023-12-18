
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int K = scanner.nextInt();

        char[][] board = new char[H][W];

        for (int i = 0 ; i < H ; i++) {
            board[i] = scanner.next().toCharArray();
        }

        int answer = 0;
        for (int i = 0 ; i < 1 << (H + W) ; i++) {
            System.out.println(Integer.toString(i, 2));
            int count = 0;
            for (int j = 0 ; j < H ; j++) {
                if (((i >> j) & 1) != 1) {
                    for (int k = 0 ; k < W ; k++) {
                        if (((i >> (H + k)) & 1) != 1) {
                            if (board[j][k] == '#') {
                                count++;
                            }
                        }
                    }
                }
            }
            if (count == K) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
