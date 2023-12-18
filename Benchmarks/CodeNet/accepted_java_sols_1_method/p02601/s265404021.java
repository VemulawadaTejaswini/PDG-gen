import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    int K = sc.nextInt();
    
    for(int i=0;i<K;i++){
      if(r>=g){
        g+=g;
      } else if(g>=b){
        b+=b;
      } else if(r<g && g<b){
        break;
      }
    }
    
    if(r<g && g<b){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}