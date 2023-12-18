import java.util.Scanner;

class Dice {
    int[] dn = new int[6];

    Dice(int[] d) {
        for (int i = 0; i < 6; i++) {
            dn[i] = d[i];
        }
    }

    void turnN() {
        int x = dn[0];
        dn[0] = dn[1];
        dn[1] = dn[5];
        dn[5] = dn[4];
        dn[4] = x;
    }

    void turnS() {
        int x = dn[0];
        dn[0] = dn[4];
        dn[4] = dn[5];
        dn[5] = dn[1];
        dn[1] = x;
    }

    void turnW() {
        int x = dn[0];
        dn[0] = dn[2];
        dn[2] = dn[5];
        dn[5] = dn[3];
        dn[3] = x;
    }

    void turnE() {
        int x = dn[0];
        dn[0] = dn[3];
        dn[3] = dn[5];
        dn[5] = dn[2];
        dn[2] = x;
    }

    void sideturn() {
        int x = dn[1];
        dn[1] = dn[2];
        dn[2] = dn[4];
        dn[4] = dn[3];
        dn[3] = x;
    }

    static boolean judge(Dice d1, Dice d2) {
        boolean a = false;

        a = a || check(d1, d2);
        d2.turnN();
        a = a || check(d1, d2);
        d2.turnE();
        a = a || check(d1, d2);
        d2.turnE();
        a = a || check(d1, d2);
        d2.turnE();
        a = a || check(d1, d2);
        d2.turnN();
        a = a || check(d1, d2);

        return a;
    }
    
    static boolean check(Dice d1, Dice d2) {
        boolean b = false;
        if (d1.dn[0] == d2.dn[0] && d1.dn[5] == d2.dn[5]) {
            for (int i = 0; i < 4; i++) {
                b = b || check2(d1, d2);
                d2.sideturn();
            }
        }
        return b;
    }
    
    static boolean check2(Dice d1, Dice d2) {
        boolean c = true;
        for (int i = 1; i < 5; i++) {
            c = c && d1.dn[i] == d2.dn[i];
        }
    
        return c;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[6];
        Dice[] dc = new Dice[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                num[j] = sc.nextInt();
            }
            dc[i] = new Dice(num);
        }

        boolean ans = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    ans = ans || Dice.judge(dc[i], dc[j]);
                }
            }
        }

        if (ans) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
