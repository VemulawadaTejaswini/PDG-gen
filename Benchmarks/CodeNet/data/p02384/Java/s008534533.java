import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bd = new StringBuilder();
        int[] dice = new int[6];
        int a = 0;
        int b = 0;
        for (int i=0; i<6; i++) {
            dice[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        Dice d = new Dice();
        for (int i=0; i<q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j=0; j<6; j++) {
                if (x == dice[j]) {
                    a = j+1;
                }
                else if (y == dice[j]) {
                    b = j+1;
                }
            }

            bd.append(dice[d.Roll(a, b) - 1] + "\n");
        }
        System.out.print(bd);
    }
}

class Dice {

    public int Roll(int a, int b) {
        switch (a) {
            case 1: {
                switch (b) {
                    case 2: return 3;
                    case 3: return 5;
                    case 4: return 2;
                    case 5: return 4;
                }
            }
            case 2: {
                switch (b) {
                    case 1: return 4;
                    case 3: return 1;
                    case 4: return 6;
                    case 6: return 3;
                }
            }
            case 3: {
                switch (b) {
                    case 1: return 2;
                    case 2: return 6;
                    case 5: return 1;
                    case 6: return 5;
                }
            }
            case 4: {
                switch (b) {
                    case 1: return 5;
                    case 2: return 1;
                    case 5: return 6;
                    case 6: return 2;
                }
            }
            case 5: {
                switch (b) {
                    case 1: return 3;
                    case 3: return 6;
                    case 4: return 1;
                    case 6: return 4;
                }
            }
            case 6: {
                switch (b) {
                    case 2: return 4;
                    case 3: return 2;
                    case 4: return 5;
                    case 5: return 3;
                }
            }
        }
        return 0;
    }
}
