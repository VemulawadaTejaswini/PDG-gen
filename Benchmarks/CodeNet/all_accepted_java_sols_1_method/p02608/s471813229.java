import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] arr = new int[10001];
      
      // 配列作成
      for(int x = 1; x <= 100; x++){
        for(int y = 1; y <= 100; y++){
          for(int z = 1; z <= 100; z++){
            int ope = x*x + y*y + z*z + x*y + y*z + z*x;
            if(ope <= 10000){
              arr[ope]++;
            }
          }
        }
      }
      
      // 出力
      for(int i = 1; i <= N; i++){
        System.out.println(arr[i]);
      }
    }

}