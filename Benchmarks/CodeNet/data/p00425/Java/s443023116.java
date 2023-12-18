import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] dice = new int[]{1, 2, 6, 5, 3, 4};
            int total = 1;
            for (int i = 0; i < n; i++) {
                String order = sc.next();
                if (order.equals("North")) {
                    int tmp = dice[0];
                    dice[0] = dice[1];
                    dice[1] = dice[2];
                    dice[2] = dice[3];
                    dice[3] = tmp;
                } else if (order.equals("South")) {
                    int tmp = dice[0];
                    dice[0] = dice[3];
                    dice[3] = dice[2];
                    dice[2] = dice[1];
                    dice[1] = tmp;
                } else if (order.equals("East")) {
                    int tmp = dice[0];
                    dice[0] = dice[5];
                    dice[5] = dice[2];
                    dice[2] = dice[4];
                    dice[4] = tmp;
                } else if (order.equals("West")) {
                    int tmp = dice[0];
                    dice[0] = dice[4];
                    dice[4] = dice[2];
                    dice[2] = dice[5];
                    dice[5] = tmp;
                } else if (order.equals("Right")) {
                    int tmp = dice[1];
                    dice[1] = dice[4];
                    dice[4] = dice[3];
                    dice[3] = dice[5];
                    dice[5] = tmp;
                } else if (order.equals("Left")) {
                    int tmp = dice[1];
                    dice[1] = dice[5];
                    dice[5] = dice[3];
                    dice[3] = dice[4];
                    dice[4] = tmp;
                }
                total += dice[0];
            }
            sb.append(total).append("\n");
        }
        System.out.print(sb);
    }
}

