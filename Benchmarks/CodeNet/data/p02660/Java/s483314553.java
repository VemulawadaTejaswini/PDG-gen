import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      
      // 約数カウント
      int count = 0;
      long root = (long)(Math.sqrt(N));
      for(int i = 1; i <= root; i++){
        if(N % i == 0){
          count++;
        }
      }
      if(root * root == N){
        count = count * 2 - 1;
      }else{
        count = count * 2;
      }
      
      // 操作回数算出
      int ope = 0;
      if(count > 3 && count % 2 == 1){
        ope++;
      }
      while(count > 1){
        ope++;
        count = count / 2;
      }
      
      
      // 出力
      System.out.println(ope);
    }
    

}