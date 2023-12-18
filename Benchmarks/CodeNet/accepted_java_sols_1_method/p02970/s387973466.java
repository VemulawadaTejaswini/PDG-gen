import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();//木の本数
      int D = sc.nextInt();
      
      //1人の監視員が監視できる範囲
      int one = D*2+1;
      
      //監視員が最低何人必要か求める
      int min = N/(D*2+1);
      if(N%one!=0){
        	System.out.println(min+1);
      }
      else{
        	System.out.println(min);
    }
    }
}