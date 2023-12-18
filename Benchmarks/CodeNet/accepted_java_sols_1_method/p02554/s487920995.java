import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      long result = 0L;
      int DIV = 1000000007;
      long pow10 = 1L;
      long pow9 = 1L;
      long pow8 = 1L;
      for(int i = 1; i <= N; i++){
        pow10 = (pow10 * 10) % DIV;
        pow9 = (pow9 * 9) % DIV;
        pow8 = (pow8 * 8) % DIV;
      }
      pow9 = (pow9 * 2) % DIV;
      result = pow10 - pow9;
      if(result < 0){
        result += DIV;
      }
      result = (result + pow8) % DIV;
      System.out.println(result);
    }
    
 
}