import java.util.*;

class Main {

    static void eraseIsland(char[][] field, int i, int j) {
        field[i][j] = '0';
        if (i < 11 && field[i+1][j] == '1') eraseIsland(field, i+1, j);
        if (j < 11 && field[i][j+1] == '1') eraseIsland(field, i, j+1);
        if (i > 0 && field[i-1][j] == '1') eraseIsland(field, i-1, j);
        if (j > 0 && field[i][j-1] == '1') eraseIsland(field, i, j-1);
    }

    static void solve (char[][] field) {
        int island = 0;

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                if (field[i][j] == '1') {
                    eraseIsland(field, i, j);
                    island += 1;
                }
            }
        }

        System.out.println(island);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        char [][] field = new char[12][12];
        
        while(sc.hasNext()) {
            
            for(int i = 0; i < 12; i++) {
                field[i] = sc.nextLine().toCharArray();
            }

            if(sc.hasNext())    sc.nextLine();

            solve(field);

        }



    }
}