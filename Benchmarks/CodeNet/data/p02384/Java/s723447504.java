import java.util.Scanner;

class Dice {
    int dn[] = new int[6];

    Dice(int d[]) {
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

    int ans(int[][] h,int n) {
        if (h[n][1] == dn[2] || h[n][1] == dn[3])
            turnW();
        while (h[n][1] != dn[1])
            turnS();
        while (h[n][0] != dn[0])
            turnW();
        return dn[2];
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
        }
        Dice d1 = new Dice(num);
        int q = sc.nextInt();
        int hint[][] = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                hint[i][j] = sc.nextInt();
            }
            System.out.println(d1.ans(hint,i));
        }
    }
}
