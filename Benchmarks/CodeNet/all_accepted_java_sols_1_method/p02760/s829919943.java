
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[][] bingo = new boolean[3][3];
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                int num = scanner.nextInt();
                int[] pos = new int[2];
                pos[0] = i;
                pos[1] = j;
                map.put(num, pos);
                bingo[i][j] = false;
            }
        }

        int N = scanner.nextInt();
        for (int i = 0 ; i < N ; i++) {
            int b = scanner.nextInt();
            if (map.containsKey(b)) {
                int[] pos = map.get(b);
                bingo[pos[0]][pos[1]] = true;
            }
        }

        for (int i = 0 ; i < 3 ; i++) {
            if (bingo[i][0] && bingo[i][1] && bingo[i][2]) {
                System.out.println("Yes");
                return;
            }
            if (bingo[0][i] && bingo[1][i] && bingo[2][i]) {
                System.out.println("Yes");
                return;
            }
        }
        
        if (bingo[0][0] && bingo[1][1] && bingo[2][2]) {
            System.out.println("Yes");
            return;
        }
        if (bingo[0][2] && bingo[1][1] && bingo[2][0]) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
