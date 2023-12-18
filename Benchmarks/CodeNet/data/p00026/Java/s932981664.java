import java.util.Scanner;

public class Main {

    /** 最大行 */
    private static final int MAX_ROWS = 10;

    /** 最大列 */
    private static final int MAX_COLUMNS = 10;

    /** インキ滴（小） */
    private static final int INK_SIZE_SMALL = 1;

    /** インキ滴（中） */
    private static final int INK_SIZE_MIDDLE = 2;

    /** インキ滴（大） */
    private static final int INK_SIZE_LARGE = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int area[][] = new int[MAX_ROWS][MAX_COLUMNS];
        clear(area);

        while(in.hasNextLine()){
            String str = in.nextLine();
            if(str == null || "".equals(str)) break;
            String[] strArray = str.split(",");
            int row = Integer.parseInt(strArray[0]);
            int column = Integer.parseInt(strArray[1]);
            int size = Integer.parseInt(strArray[2]);

            //インキ滴を落とす
            dropInk(area, row, column, size);
        }
        //結果を出力
        printAreaInfo(area);
        in.close();
    }

    //色のついていない部分のマス目の個数と、１番濃いマス目の濃さを出力
    private static void printAreaInfo(int[][] area) {
        int maxInk = 0;
        int blanks = 0;

        for (int i = 0; i < area.length; i++){
            for (int j = 0; j < area[i].length; j++){
                if(maxInk < area[i][j]) maxInk = area[i][j];
                else if (area[i][j] == 0) blanks++;
            }
        }
        System.out.println(blanks);
        System.out.println(maxInk);
    }

    //落としたインキ滴の大きさに応じてたメソッドの呼び出し
    private static void dropInk(int[][] area, int row, int column, int size) {
        switch (size){
        case INK_SIZE_SMALL:
            small(area, row, column);
            break;
        case INK_SIZE_MIDDLE:
            middle(area, row, column);
            break;
        case INK_SIZE_LARGE:
            large(area, row, column);
            break;
        }
    }

    //インキ滴（大）を落とした場合
    //インキ滴（大） = インキ滴（中）+ 中心から上下左右2マス目の領域
    private static void large(int[][] area, int row, int column) {
        middle(area, row, column);

        for(int r = row - 2; r <= row + 2; r = r + 4){
            if (r >= 0 && r < 10) area[r][column]++;
        }
        for(int c = column - 2; c <= column + 2; c = c + 4){
            if (c >= 0 && c < 10) area[row][c]++;
        }
    }

    //インキ滴（中）を落とした場合
    //インキ滴（中） = インキ滴（小）+ 中心から斜め4方向1マス目の領域
    private static void middle(int[][] area, int row, int column) {
        small(area, row, column);

        for(int r = row - 1; r <= row + 1; r = r + 2){
            if (r < 0 || r >= 10) continue;
            for(int c = column - 1; c <= column + 1; c = c + 2){
                if (c >= 0 && c < 10) area[r][c]++;
            }
        }
    }

    //インキ滴（小）を落とした場合
  //インキ滴（小） = 中心+ 上下左右1マス目の領域
    private static void small(int[][] area, int row, int column) {
        area[row][column] += 1;

        for(int r = row - 1; r <= row + 1; r = r + 2){
            if (r >= 0 && r < 10) area[r][column]++;
        }
        for(int c = column - 1; c <= column + 1; c = c + 2){
            if (c >= 0 && c < 10) area[row][c]++;
        }
    }

    //配列を初期化
    private static void clear(int[][] area) {
        for (int i = 0; i < area.length; i++){
            for (int j = 0; j < area[i].length; j++)
                area[i][j] = 0;
        }
    }
}