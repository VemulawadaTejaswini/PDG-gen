import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    for(int i = 0 ; i < 200 ; ++i){
      //高橋君の攻撃
      c -= b;
      //青木君の体力０以下かどうか
      if(c <= 0){
        //０以下なら高橋君の勝ち
        System.out.println("Yes");
        break;
      }
      
      //青木君の攻撃
      a -= d;
       //高橋君の体力０以下かどうか
      if(a <= 0){
        //０以下なら青木君の勝ち
        System.out.println("No");
        break;
      }
      
    }
  }
}