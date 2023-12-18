import java.util.*;

class Main {

    static char [][] field;

    static void bomb (int x, int y) {
        field [x][y] = '0';

        for (int i = Math.max(x - 3, 0); i <= Math.min(x + 3, 7); i++) {
            if (field [i][y] == '1')    bomb(i, y);
        }
        for (int i = Math.max(y - 3, 0); i <= Math.min(y + 3, 7); i++) {
            if (field [x][i] == '1')    bomb(x, i);
        }
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        sc.nextLine();
        field = new char [8][8];
        int data = 1;

        while(sc.hasNext()) {
            for (int i = 0; i < 8; i++) {
                field[i] = sc.nextLine().toCharArray();
            }
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            bomb(y, x);

            System.out.printf("Data %d:\n", data);
            for(int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println("");
            }

            if(sc.hasNext())    sc.nextLine(); sc.nextLine();

            data += 1;

        }

    }
}