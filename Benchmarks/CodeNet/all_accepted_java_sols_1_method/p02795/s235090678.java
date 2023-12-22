import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int n = Integer.parseInt(sc.next());
    
    int p = 0;
    int pd = 0;
    
    if(h>w){
      p = h;
      for(int i=1; i<=w; i++){
        pd += p;
          if(pd >= n){
            System.out.println(i);
            return;
          }
      }
    } else {
      p = w;
      for(int i=1; i<=h; i++){
        pd += p;
          if(pd >= n){
            System.out.println(i);
            return;
          }
      }
    }
    
  }
}
