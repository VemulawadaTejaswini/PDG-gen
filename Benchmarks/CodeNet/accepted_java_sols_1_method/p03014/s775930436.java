import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] walls = new char[h][w];

        for (int i = 0; i < h; i++){
            String str = sc.next();
            char[]  row = str.toCharArray();
            walls[i] = row;
        }

        int[][] lefts = new int[h][w];
        int[][] rights = new int[h][w];
        int[][] ups = new int[h][w];
        int[][] downs = new int[h][w];

        int maxHeightIndex = h - 1;
        int maxWidthIndex = w - 1;

        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (walls[i][j] == '#'){
                    lefts[i][j] = 0;
                    ups[i][j] = 0;
                }else {
                    if (i == 0){
                        ups[i][j] = 1;
                    }else {
                        ups[i][j] = ups[i - 1][j] + 1;
                    }

                    if (j == 0){
                        lefts[i][j] = 1;
                    }else {
                        lefts[i][j] = lefts[i][j - 1] + 1;
                    }
                }

                if (walls[maxHeightIndex - i][maxWidthIndex - j] == '#'){
                    downs[maxHeightIndex - i][maxWidthIndex - j] = 0;
                    rights[maxHeightIndex - i][maxWidthIndex - j] = 0;
                }else {
                    if (i == 0){
                        downs[maxHeightIndex - i][maxWidthIndex - j] = 1;
                    }else {
                        downs[maxHeightIndex - i][maxWidthIndex - j] = downs[maxHeightIndex - (i - 1)][maxWidthIndex - j] + 1;
                    }

                    if (j == 0){
                        rights[maxHeightIndex - i][maxWidthIndex - j] = 1;
                    }else {
                        rights[maxHeightIndex - i][maxWidthIndex - j] = rights[maxHeightIndex - i][maxWidthIndex - (j - 1)] + 1;
                    }

                }

            }
        }

        int max = 0;
        int candidate = 0;

        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                candidate = lefts[i][j] + rights[i][j] + ups[i][j] + downs[i][j] - 3;
                if (candidate > max){
                    max = candidate;
                }
            }
        }

        System.out.println(max);
    }

}