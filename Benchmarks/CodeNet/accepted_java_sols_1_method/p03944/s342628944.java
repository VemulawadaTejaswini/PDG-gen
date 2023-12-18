import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int w1 = 0;
    int h1 = 0;
    int w2 = 0;
    int h2 = 0;
    
    //黒くなる部分求める
    for(int i = 0 ; i < n ; ++i){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();      
      if(a==1){
        w1 = Math.max(w1,x);
      }
      if(a==2){
        w2 = Math.max(w2,(w-x));
      }
      if(a==3){
        h1 = Math.max(h1,y);
      }
      if(a==4){
        h2 = Math.max(h2,(h-y));
      }
    }
    int ans = (w-w1-w2)*(h-h1-h2);
    if(w-w1-w2<0 || h-h1-h2<0) ans = 0;
    System.out.println(ans);
    
  }
}