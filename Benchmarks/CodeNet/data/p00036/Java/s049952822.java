import java.util.*;

public class Main {
    static final int COLUMN = 8;
    static final int ROW = 8;
    static final String[] FIG = {"A", "B", "C", "D", "E", "F", "G"};

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String[] str = new String[8];
            
            for (int i = 0; i < ROW; i++) {
                str[i] = scanner.next();
            }
            
            int[] figXIdx = new int[4];
            int[] figYIdx = new int[4];
            int cnt = 0;
                    
            for (int i = 0; i < ROW; i++) {
                for (int j = 0; j < COLUMN; j++) {
                    if (str[i].charAt(j) == '1') {
                        figXIdx[cnt] = j;
                        figYIdx[cnt] = i;
                        cnt++;
                    }
                }
            }
            System.out.println(FIG[judgeFig(figXIdx, figYIdx)]);
            scanner.nextLine();
        }            
    }
    
    public static int judgeFig(int[] x, int[] y) {
        
        int x1 = x[0];
        int x2 = x[1];
        int x3 = x[2];
        int x4 = x[3];
        int y1 = y[0];
        int y2 = y[1];
        int y3 = y[2];
        int y4 = y[3];

        if (x1 == x3 && x2 == x4 && y1 == y2 && y3 == y4) {
            return 0;
        } else if (x1 == x2 && x2 == x3 && x3 == x4 && x4 == x1) {
            return 1;
        } else if (y1 == y2 && y2 == y3 && y3 == y4 && y4 == y1) {
            return 2;
        } else if (x1 == x3) {
            return 3;
        } else if (x2 == x3) {
            return 4;
        } else if (x1 == x2) {
            return 5;
        } else {
            return 6;
        }
    }
}