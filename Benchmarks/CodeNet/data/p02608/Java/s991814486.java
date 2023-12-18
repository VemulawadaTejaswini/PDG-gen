import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //行数
    int n = sc.nextInt();
    //現在の行数
    int i = 1;
    while(i <= n){
      int ans = 0;
      for(int x = 1;x < i;x++){
        for(int y = 1; y < i;y++){
          for(int z = 1; z < i;z++){
            int xsquare = (int)Math.pow(x,2);
            int ysquare = (int)Math.pow(y,2);
            int zsquare = (int)Math.pow(z,2);
            int ans1 = xsquare + ysquare + zsquare + x * y + y * z + z * x;

            //System.out.println(ans1);
            if(ans1 == i){
              ans++;
            }
          }
        }
      }
      i++;
      System.out.println(ans);
    }
  }
}