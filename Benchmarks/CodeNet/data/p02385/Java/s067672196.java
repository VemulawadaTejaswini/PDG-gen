import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice[] dices = new Dice[]{new Dice(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(),
                                                     sc.nextInt(), sc.nextInt(), sc.nextInt()}),
                                  new Dice(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(),
                                                     sc.nextInt(), sc.nextInt(), sc.nextInt()})};
        if (!easyTest(dices)) {
            System.out.println("No");
            return;
        }

        while (dices[0].eyes[dices[0].now[0]] != dices[1].eyes[dices[1].now[0]]) {
            int idx = dices[1].find(dices[0].eyes[dices[0].now[0]]);
            if (idx == 2 || idx == 4) {
                dices[1].move('E');
            } else {
                dices[1].move('N');
            }
        }
        int opCount = 0;
        while (dices[0].eyes[dices[0].now[1]] != dices[1].eyes[dices[1].now[1]] && opCount < 4) {
            opCount++;
            dices[1].spin('R');
        }
        for (int i = 0; i < dices[0].eyes.length; i++) {
            if (dices[0].eyes[dices[0].now[i]] != dices[1].eyes[dices[1].now[i]]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    static boolean easyTest(Dice[] dices) {
        int[][] check = new int[][]{{dices[0].eyes[0], dices[0].eyes[1], dices[0].eyes[2],
                                     dices[0].eyes[3], dices[0].eyes[4], dices[0].eyes[5]},
                                    {dices[1].eyes[0], dices[1].eyes[1], dices[1].eyes[2],
                                     dices[1].eyes[3], dices[1].eyes[4], dices[1].eyes[5]}};
        Arrays.sort(check[0]);
        Arrays.sort(check[1]);
        for (int i = 0; i < check[0].length; i++) {
            if (check[0][i] != check[1][i]) {
                return false;
            }
        }
        return true;
    }

    static class Dice {

        int[] eyes;
        int[/*TOP N E S W BOT*/] now;

        public Dice(int[] eyes) {
            this.eyes = eyes;
            this.now = new int[]{0, 4, 2, 1, 3, 5};
        }

        int find(int eye) {
            for (int i = 0; i < now.length; i++) {
                if (eyes[now[i]] == eye) {
                    return i;
                }
            }
            return -1; // never comes
        }

        void move(char way) {
            int tmp;
            switch (way) {
                case 'N':
                    tmp = now[0];
                    now[0] = now[3];
                    now[3] = now[5];
                    now[5] = now[1];
                    now[1] = tmp;
                    break;
                case 'E':
                    tmp = now[0];
                    now[0] = now[4];
                    now[4] = now[5];
                    now[5] = now[2];
                    now[2] = tmp;
                    break;
                case 'S':
                    tmp = now[0];
                    now[0] = now[1];
                    now[1] = now[5];
                    now[5] = now[3];
                    now[3] = tmp;
                    break;
                case 'W':
                    tmp = now[0];
                    now[0] = now[2];
                    now[2] = now[5];
                    now[5] = now[4];
                    now[4] = tmp;
                    break;
            }
        }

        void spin(char way) {
            int tmp;
            switch (way) {
                case 'R':
                    tmp = now[1];
                    now[1] = now[4];
                    now[4] = now[3];
                    now[3] = now[2];
                    now[2] = tmp;
                    break;
                case 'L':
                    tmp = now[1];
                    now[1] = now[2];
                    now[2] = now[3];
                    now[3] = now[4];
                    now[4] = tmp;
                    break;
            }
        }
    }
}