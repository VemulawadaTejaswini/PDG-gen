import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        bingo[0][0] = sc.nextInt();
        bingo[0][1] = sc.nextInt();
        bingo[0][2] = sc.nextInt();
        sc.nextLine();
        bingo[1][0] = sc.nextInt();
        bingo[1][1] = sc.nextInt();
        bingo[1][2] = sc.nextInt();
        sc.nextLine();
        bingo[2][0] = sc.nextInt();
        bingo[2][1] = sc.nextInt();
        bingo[2][2] = sc.nextInt();
        sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
            if (i != n -1) {
                sc.nextLine();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (set.contains(bingo[i][j])) {
                    bingo[i][j] = 0;
                }
            }
        }

        boolean isBingo = false;
        for (int i = 0; i < 3; i++) {
            if ((bingo[i][0] == 0 && bingo[i][1] == 0 && bingo[i][2] == 0)
                    || (bingo[0][i] == 0 && bingo[1][i] == 0 && bingo[2][i] == 0)) {
                isBingo = true;
                break;
            }
        }
        if (!isBingo) {
            if ((bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0)
                    || (bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0)) {
                isBingo = true;
            }
        }

        if (isBingo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
