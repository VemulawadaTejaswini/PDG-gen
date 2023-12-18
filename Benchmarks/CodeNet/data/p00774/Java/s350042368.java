//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1148

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // int TC = Integer.parseInt(sc.next(), 10);
        
        while (true) {
            int R = sc.nextInt();
            if (R == 0) break;
            
            int[][] puzzle = new int[R][5];
            
            for (int r = 0; r < R; r++) {
                for (int c = 0; c < 5; c++) {
                    puzzle[r][c] = sc.nextInt();
                }
            }
            
            int totalScore = 0;
            
            while (true) {
                boolean foundMatch = false;
                
                int tempScore = getTempScore(puzzle, R);
                if (tempScore > 0) {
                    foundMatch = true;
                    totalScore += tempScore;
                    settle(puzzle, R);
                }
                
                if (!foundMatch) break;
            }
            
            System.out.println(totalScore);
        }
    }
    
    public static int getTempScore(int[][] puzzle, int R) {
        int tempScore = 0;
        for (int r = 0; r < R; r++) {
            int a0 = puzzle[r][0];
            int a1 = puzzle[r][1];
            int a2 = puzzle[r][2];
            int a3 = puzzle[r][3];
            int a4 = puzzle[r][4];
            
            if (a0 > 0 && a0 == a1 && a0 == a2 && a0 == a3 && a0 == a4) {
                tempScore += a0 * 5;
                puzzle[r][0] = 0;
                puzzle[r][1] = 0;
                puzzle[r][2] = 0;
                puzzle[r][3] = 0;
                puzzle[r][4] = 0;
            }
            else if (a0 > 0 && a0 == a1 && a0 == a2 && a0 == a3 && a0 != a4) {
                tempScore += a0 * 4;
                puzzle[r][0] = 0;
                puzzle[r][1] = 0;
                puzzle[r][2] = 0;
                puzzle[r][3] = 0;
            }
            else if (a1 > 0 && a0 != a1 && a1 == a2 && a1 == a3 && a1 == a4) {
                tempScore += a1 * 4;
                puzzle[r][1] = 0;
                puzzle[r][2] = 0;
                puzzle[r][3] = 0;
                puzzle[r][4] = 0;
            }
            else if (a0 > 0 && a0 == a1 && a0 == a2 && a0 != a3) {
                tempScore += a0 * 3;
                puzzle[r][0] = 0;
                puzzle[r][1] = 0;
                puzzle[r][2] = 0;
            }
            else if (a1 > 0 && a0 != a1 && a1 == a2 && a1 == a3 && a1 != a4) {
                tempScore += a1 * 3;
                puzzle[r][1] = 0;
                puzzle[r][2] = 0;
                puzzle[r][3] = 0;
            }
            else if (a4 > 0 && a4 != a1 && a4 == a2 && a4 == a3) {
                tempScore += a4 * 3;
                puzzle[r][2] = 0;
                puzzle[r][3] = 0;
                puzzle[r][4] = 0;
            }
        }
        return tempScore;
    }
    
    public static void settle(int[][] puzzle, int R) {
        for (int c = 0; c < 5; c++) {
            while (true) {
                boolean again = false;
                for (int r = 0; r < R-1; r++) {
                    if (puzzle[r][c] > 0 && puzzle[r+1][c] == 0) {
                        int tmp = puzzle[r][c];
                        puzzle[r][c] = 0;
                        puzzle[r+1][c] = tmp;
                        again = true;
                    }
                }
                if (!again) break;
            }
        }
    }
}


