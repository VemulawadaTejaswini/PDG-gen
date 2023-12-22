import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int D = sc.nextInt();
    
    int ans = 0;
    for(int i = 1; i <= M; i++){
      for(int j = 1; j <= D; j++){
        int d1 = j%10;
        int d2 = j/10;
        if(d1 < 2 || d2 < 2){
          continue;
        }
        if(d1*d2 == i){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}