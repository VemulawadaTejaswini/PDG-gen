import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
 	//鬼の座標
    int a = sc.nextInt();
    //鬼のはやさ
    int v = sc.nextInt();
    //逃げる人の座標
    int b = sc.nextInt();
    //はやさ
    int w = sc.nextInt();
    //秒数
    int t = sc.nextInt();
    
    //逃げる人の方が早い時
    if(v <= w){
      System.out.print("NO");
    }
    //鬼の方が早い
    if(v > w){
      int dist = Math.abs(a - b);
      int dif = v - w;
      if(dist / dif <= t){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    }
  }
}
