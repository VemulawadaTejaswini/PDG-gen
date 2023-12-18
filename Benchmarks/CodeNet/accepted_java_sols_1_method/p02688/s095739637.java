import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      
      // お菓子持ってない人をカウント
      boolean[] okashi = new boolean[N];
      for(int i = 0; i < N; i++){
        okashi[i] = false;
      }
      
      for(int i = 0; i < K; i++){
        int person = sc.nextInt();
        for(int j = 0; j < person; j++){
          int index = sc.nextInt()-1;
          okashi[index] = true;
        }
      }
      
      int count = 0;
      for(int i = 0; i < N; i++){
        if(!okashi[i]){
          count++;
        }
      }
      
      // 出力
      System.out.println(count);
    }

}