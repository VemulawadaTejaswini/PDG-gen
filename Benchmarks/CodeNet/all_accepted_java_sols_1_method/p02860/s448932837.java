import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();//文字列の長さ
      String S = sc.next();//文字列
      
      //文字列の前半と後半
      String first = S.substring(0,(N/2));
      String last = S.substring((N/2),N);
      
      //前半と後半が同じ文字列か比較
      if(first.equals(last)){
       System.out.println("Yes");
      }
      else{
       System.out.println("No");
      }
    }
}