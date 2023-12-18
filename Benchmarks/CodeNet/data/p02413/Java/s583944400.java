import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inR, inC;
        int[][] spd;

        inR = Integer.parseInt(scan.next());
        inC = Integer.parseInt(scan.next());

        spd = new int[inR + 1][inC + 1];

        for (int i = 0; i < inR + 1; i++) {
            for (int j = 0; j < inC + 1; j++) {
                spd[i][j] = 0;
            }
        }


        for (int i = 0; i < inR; i++) {
            for (int j = 0; j < inC; j++) {
                spd[i][j] = Integer.parseInt(scan.next());
                spd[inR][j] += spd[i][j];
                spd[i][inC] += spd[i][j];
                spd[inR][inC] += spd[i][j];
            }
        }
        for (int i = 0; i < inR + 1; i++) {
            for (int j = 0; j < inC + 1; j++) {
                System.out.print(spd[i][j]);
                if (j != inC) System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

