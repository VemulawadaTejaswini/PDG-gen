import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] paper = new int[10][10];
        int max = 0;
        int counter = 0;
        
        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper[i].length; j++) {
                paper[i][j] = 0;
            }
        }
        
        while (scanner.hasNext()) {
            String strLine = scanner.next();
            String[] str = strLine.split(",");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int size = Integer.parseInt(str[2]);

            paper[x][y]++;
            if (isInsidePaper(x, y-1)) paper[x][y-1]++;
            if (isInsidePaper(x-1, y)) paper[x-1][y]++;
            if (isInsidePaper(x+1, y)) paper[x+1][y]++;
            if (isInsidePaper(x, y+1)) paper[x][y+1]++;

            if (size >= 2) {
                if (isInsidePaper(x-1, y-1))    paper[x-1][y-1]++;
                if (isInsidePaper(x+1, y-1))    paper[x+1][y-1]++;
                if (isInsidePaper(x-1, y+1))    paper[x-1][y+1]++;
                if (isInsidePaper(x+1, y+1))    paper[x+1][y+1]++;
            }
            if (size == 3) {
                if (isInsidePaper(x, y-2))    paper[x][y-2]++;
                if (isInsidePaper(x-2, y))    paper[x-2][y]++;
                if (isInsidePaper(x+2, y))    paper[x-2][y]++;
                if (isInsidePaper(x, y+2))    paper[x][y+2]++;
            }
        }
        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper[i].length; j++) {
                if (paper[i][j] == 0) {
                    counter++;
                } else {
                    if (paper[i][j] > max) max = paper[i][j];
                }
            }
        }
        System.out.println(counter);
        System.out.println(max);
    }
    
    public static boolean isInsidePaper(int x, int y) {
        if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
            return true;
        } else {
            return false;
        }
    }
}