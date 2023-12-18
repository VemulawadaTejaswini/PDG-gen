import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String str = sc.next();
      String[] C = str.split("");
      
      // 判定
      int red = 0;
      int white = 0;
      int[] whiteCounter = new int[N];
      for(int i = 0; i < N; i++){
        if(C[i].equals("W")){
          white++;
        }else{
          red++;
        }
        whiteCounter[i] = white;
      }
      
      int result = 0;
      if(red > 0){
        result = whiteCounter[red-1];
      }
      
      // 出力
      System.out.println(result);
    }
    

}