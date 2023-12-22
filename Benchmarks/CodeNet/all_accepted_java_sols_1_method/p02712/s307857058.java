import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      long n = Long.parseLong(sc.next());
      long total = 0;
      for(long i=0; i<=n; i++){
        if(i % 3 == 0 || i % 5 == 0 ){
        }else{
          total += i;
        }
      }
      System.out.println(total);   
    }
}
