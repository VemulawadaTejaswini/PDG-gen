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

        for (int i = 0; i < dices[0].eyes.length; i++) {
            for (int j = 0; j < 4; j++) {
                boolean flag = true;
                for (int k = 0; k < dices[0].eyes.length; k++) {
                    if (dices[0].eyes[dices[0].now[k]] != dices[1].eyes[dices[1].now[k]]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Yes");
                    return;
                }

                dices[1].spin('R');
            }
            if (i < 4) {
                dices[1].move('N');
            } else if (i == 4) {
                dices[1].move('E');
            } else {
                dices[1].move('W');
                dices[1].move('W');
            }
        }

        System.out.println("No");
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