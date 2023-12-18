import java.util.*;

class Main {

    static void solve (char [][] field) {
        boolean found = false;
        int y = 0;
        int x = 0;

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if((!found) && field[i][j] == '1') {
                    y = i;
                    x = j;
                    found = true;
                }
            }
        }

        if( x < 7 && field[y][x+1] == '1' ) {   // 右どなりにもブロックがあるとき
            if ( x < 6 && field[y][x+2] == '1' ) {  // 2 つとなりにもブロックがあるとき
                System.out.println("C");
                return;
            }
            if ( y < 7 && field[y+1][x] == '1' ) {  // 1 つ下にもブロックがあるとき
                if ( field[y+1][x+1] == '1') {      // 右下にもブロックがあるとき
                    System.out.println("A");
                    return;
                }
                System.out.println("G");
                return;
            }
            System.out.println("E");
            return;
        }
        if ( x < 7 && field[y+1][x+1] == '1') {
            System.out.println("F");
            return;
        }
        if ( x > 0 && field[y+1][x-1] == '1') {
            System.out.println("D");
            return;
        }
        System.out.println("B");
        return;
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
       
        char [][] field = new char [8][8];

        while(sc.hasNext()) {

            for(int i = 0; i < 8; i++) {
                field[i] = sc.nextLine().toCharArray();
            }
            if(sc.hasNext()) sc.nextLine();

            solve(field);
        }

    }
}