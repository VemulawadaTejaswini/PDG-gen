import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int h = 0;
      int n = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      if(n == 0 && x == 0){
        break;
      }
      for(int i = 1; i <= n; i++){
        for(int j = i + 1; j <= n; j++){
          for(int k = j + 1; k <= n; k++){
            //System.out.printf("%d %d %d\n", i, j, k);
            if((i + j + k) == x){
              h += 1;
            }
          }
        }
      }
      System.out.printf("%d\n", h);
    }
  }
}
