import java.util.*;

public class Main {
    public static final int COLUMN = 8;
    public static final int ROW = 8;
    public static final String[] FIG = {"A", "B", "C", "D", "E", "F", "G"};

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int[] figIdx = new int[8];
            int cnt = 0;
                    
            int[][] input = new int[ROW][COLUMN];
            for (int i = 0; i < ROW; i++) {
                String inputLine = scanner.nextLine();
                System.out.println(inputLine);
                for (int j = 0; j < COLUMN; j++) {
                    input[i][j] = Integer.valueOf(""+inputLine.charAt(j));
                    if (input[i][j] == 1) {
                        figIdx[cnt] = j;
                        figIdx[cnt+4] = i;
                        cnt++;
                    }
                }
            }
            System.out.println(FIG[judgeFig(figIdx)]);
            scanner.nextLine();
        }            
    }
    
    public static int judgeFig(int[] figIdx) {
        
        int x1 = figIdx[0];
        int x2 = figIdx[1];
        int x3 = figIdx[2];
        int x4 = figIdx[3];
        int y1 = figIdx[4];
        int y2 = figIdx[5];
        int y3 = figIdx[6];
        int y4 = figIdx[7];

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