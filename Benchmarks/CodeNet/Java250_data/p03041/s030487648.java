import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        // 文字列の入力
        String S = sc.next(); 
      //変換
      char[] A = S.toCharArray();
      
      int M = K-1;
     int sabun ='A'-'a';

      int z = (int)A[M]-sabun;
      
      A[M] = (char)z;

   
        // 出力
        System.out.println(A);
    }
}