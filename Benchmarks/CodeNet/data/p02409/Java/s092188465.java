import java.util.Scanner;

public class Main {
    private int[][][] numOfppl = new int[4][3][10];

    public void  initRoom() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    numOfppl[i][j][k] = 0;
                }
            }
        }
    }

    public void addPpl(int b, int f, int r, int v) {
        numOfppl[b][f][r] += v;
    }

    public void printRoom() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" " + numOfppl[i][j][k]);
                }
                System.out.print("\n");
            }
            if (i != 3) System.out.println("####################");
        }

    }
    public static void main(String[] args) {
        Main app = new Main();
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.next());

        app.initRoom();
        for (int i = 0; i < num; i++) {
            int b = Integer.parseInt(scan.next()) - 1;
            int f = Integer.parseInt(scan.next()) - 1;
            int r = Integer.parseInt(scan.next()) - 1;
            int v = Integer.parseInt(scan.next());
            app.addPpl(b, f, r, v);
        }
        app.printRoom();
    }
}

