import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int H = sc.nextInt();
      int W = sc.nextInt();
      int K = sc.nextInt();
      String[][] grid = new String[H][W];
      int black = 0;
      for(int i = 0; i < H; i++){
        String line = sc.next();
        grid[i] = line.split("");
        for(int j = 0; j < W; j++){
          if(grid[i][j].equals("#")){
            black++;
          }
        }
      }
      
      // 条件を満たす選び方を探索
      int maxH = pow(2, H);
      int maxW = pow(2, W);
      
      int count = 0;
      for(int i = 0; i < maxH; i++){
        for(int j = 0; j < maxW; j++){
          int remain = paintRed(grid, i, j, H, W);
          if(remain == K){
            count++;
          }
          //System.out.println("(" + i + "," + j + ") = " + remain);
        }
      }
      
      // 出力
      //System.out.println(result);
      System.out.println(count);
    }
    
    // 累乗を計算する関数
    public static int pow(int a, int b){
      int ans = 1;
      for(int i = 0; i < b; i++){
        ans *= a;
      }
      return ans;
    }
    
    // 残った黒マス数を求める関数
    public static int paintRed(String[][] grid, int rowNum, int colNum, int H, int W){
      int count = 0;
      List<Integer> rowList = new ArrayList<>();
      List<Integer> colList = new ArrayList<>();
      rowList = convert(rowNum, H);
      colList = convert(colNum, W);
      for(int i = 0; i < rowList.size(); i++){
        int row = rowList.get(i);
        for(int j = 0; j < colList.size(); j++){
          int col = colList.get(j);
          if(grid[row][col].equals("#")){
            count++;
          }
        }
      }
      
      return count;
    }
    
    // パターン番号を2進表記にし、1が立つ番号リストを返す関数
    public static List<Integer> convert(int num, int length){
      int index = 0;
      List<Integer> list = new ArrayList<>();
      for(int i = 0; i < length; i++){
        if(num % 2 == 0){
          list.add(i);
        }
        num = num / 2;
      }
      
      return list;
    }
    
    // 文字列のx文字目を取得する関数
    public static String strAt(String str, int x){
      return String.valueOf(str.charAt(x));
    }
    
    // クラス開始ロガー関数
    // String className : クラス名
    public static void loggerStart(String className){
      System.out.println("Start " + className);
    }
    
    // クラス終了ロガー関数
    // String className : クラス名
    public static void loggerEnd(String className){
      System.out.println("End " + className);
    }
    
    // Int型変数ロガー関数
    // String name : 変数名
    // int val : 値
    public static void loggerInt(String name, int val){
      System.out.println(name + " = " + val);
    }
    
    // double型変数ロガー関数
    // String name : 変数名
    // double val : 値
    public static void loggerDbl(String name, double val){
      System.out.println(name + " = " + val);
    }
    
    // String型変数ロガー関数
    // String name : 変数名
    // String val : 値
    public static void loggerStr(String name, String val){
      System.out.println(name + " = " + val);
    }
    
    // Long型変数ロガー関数
    // String name : 変数名
    // Long val : 値
    public static void loggerLong(String name, long val){
      System.out.println(name + " = " + val);
    }
    
    // Int型配列変数ロガー関数
    // String name : 変数名
    // int val : 値
    public static void loggerArrayInt(String name, int[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
    
    // Double型配列変数ロガー関数
    // String name : 変数名
    // double val : 値
    public static void loggerArrayDbl(String name, double[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
    
    // String型配列変数ロガー関数
    // String name : 変数名
    // String val : 値
    public static void loggerArrayStr(String name, String[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
    
    // Long型配列変数ロガー関数
    // String name : 変数名
    // Long val : 値
    public static void loggerArrayLong(String name, long[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
    


}