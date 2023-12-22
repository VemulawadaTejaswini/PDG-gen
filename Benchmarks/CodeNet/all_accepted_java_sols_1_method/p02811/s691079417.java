import java.util.*;
 
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int K = sc.nextInt();
    int X = sc.nextInt();     

    if( 500 * K >= X){
      // 500*KがX以上の場合
      System.out.println("Yes");
    }else{
      //それ以外
       System.out.println("No");
    }
  }
 }