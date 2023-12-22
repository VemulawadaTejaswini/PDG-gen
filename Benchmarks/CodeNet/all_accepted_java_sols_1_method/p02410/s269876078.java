import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

  public static void main(String[] args) throws IOException {
    // 標準入力用
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    // 標準入力の値を、半角スペースで分割
    String[] inputRowAndCol = (input.readLine()).split("\\s");
    int row = Integer.parseInt(inputRowAndCol[0]); // 行
    int col = Integer.parseInt(inputRowAndCol[1]); // 列

    // 行列A
    int[][] matrixA = new int[row][col];
    String[] matrixData = null; // 実際の行列のデータ用
    // 行の数だけ繰り返し
    for (int i = 0; i < row; i++) {
      // 標準入力の値を、半角スペースで分割
      matrixData = (input.readLine()).split("\\s");
      // 列の数だけ繰り返し
      for (int j = 0; j < col; j++) {
        // 行列Aに、標準入力の値を設定していく
        matrixA[i][j] = Integer.parseInt(matrixData[j]);
      }
    }
    // ベクトルb
    int[] vectorB = new int[col];
    for (int k = 0; k < col; k++) {
      vectorB[k] = Integer.parseInt(input.readLine());
    }

    // 行列の積
    // 行の数だけ繰り返し
    for (int l = 0; l < row; l++) {
      int result = 0; // リセット（次の行の計算のため初期化）
      // 列の数だけ繰り返し
      for (int m = 0; m < col; m++) {
        // 計算
        result += (matrixA[l][m] * vectorB[m]);
      }
      // 表示
      System.out.println(result);
    }
  }
}
