import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int n =sc.nextInt();//整数(10進数)
      int k =sc.nextInt();//進数 
      
      //10進数→k進数
      //int i_k = Integer.parseInt(Integer.toString(n,k));
      String i_k = Integer.toString(n,k);
      
      //桁数を出力
      System.out.println((i_k).length());
    }
}