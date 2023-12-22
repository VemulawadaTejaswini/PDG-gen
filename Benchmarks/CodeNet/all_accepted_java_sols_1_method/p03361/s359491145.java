import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] picture = new char[row][col];
        for(int r = 0; r < row; r++) {
            String line = sc.next();
            for(int c = 0; c < col; c++) {
                picture[r][c] = line.charAt(c);
            }
        }
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                if(picture[r][c] == '.') continue;
                int count = 0;
                for(int i = -1; i <= 1; i++) {
                    for(int j = -1; j <= 1; j++) {
                        if(i == 0 && j == 0 || i == -1 && j == -1 || i == 1 && j == -1 || i == -1 && j == 1 || i == 1 && j == 1) continue;
                        int nextRow = r + i;
                        int nextCol = c + j;
                        if(nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col) {
                            if(picture[nextRow][nextCol] == '#') count++;
                        }
                    }
                }
                if(count == 0) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}