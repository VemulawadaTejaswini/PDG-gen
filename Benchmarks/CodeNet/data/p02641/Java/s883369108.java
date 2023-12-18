import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int N = sc.nextInt();
      int[] p = new int[N];
      int result = 0;
      if(N == 0){
        result = X;
      }else{
        for(int i = 0; i < N; i++){
          p[i] = sc.nextInt();
        }
      }
      
      // 判定
      if(N != 0){
        boolean[] list = new boolean[102];
        Arrays.fill(list, true);
        for(int i = 0; i < N; i++){
          int index = p[i];
          list[index] = false;
        }
        
        int pos = X;
        int dif = 0;
        boolean judge = list[X];
        while(!judge){
          dif++;
          pos = X - dif;
          judge = list[pos];
          if(!judge){
            pos = X + dif;
            judge = list[pos];
          }
        }
        result = pos;
      }
      
      // 出力
      System.out.println(result);
    }
    

}