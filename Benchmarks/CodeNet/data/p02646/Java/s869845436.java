import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
 
    //座標A
    int a = sc.nextInt();
    //鬼役のスピード
    int v = sc.nextInt();
    
    //座標B
    int b = sc.nextInt();
    //はやさ
    int w = sc.nextInt();
    //秒数
    int t = sc.nextInt();
    if(a < b){
     a = a + v * t;
     b = b + w * t;
      
     if(a == b || a > b){
      System.out.print("YES");
     }else{
      System.out.print("NO");
     }
      
    }else{
      a = a - v * t;
      b = b - w * t;
      if(a == b || a < b){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    }
  }
}