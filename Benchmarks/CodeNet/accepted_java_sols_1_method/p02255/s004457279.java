import java.util.*;

public class Main {
  public static void main(String[] args){

      /* Scanner */
      Scanner sc = new Scanner(System.in);
      int length = sc.nextInt(); /* 文字数の長さ */

      /* 各配列へのデータの格納 */
      int[] data = new int[length]; /* データ配列の作成 */
      for (int i = 0; i < length; i++){
        data[i] = sc.nextInt();
      }

      for (int k = 0; k < length; k++){
        System.out.print(data[k]);
        if (k != length - 1) System.out.print(" ");
        else System.out.print("\n");
      }

      /* 挿入ソート */
      for (int i = 1; i < length; i++){
        int temp = data[i];
        int j = i - 1;
        while (j >= 0 && data[j] > temp){
          data[j + 1] = data[j];
          j--;
        }
        data[j + 1] = temp;

        /* 途中経過を表示 */
        for (int k = 0; k < length; k++){
          System.out.print(data[k]);
          if (k != length - 1) System.out.print(" ");
          else System.out.print("\n");
        }
      }
  }
}
