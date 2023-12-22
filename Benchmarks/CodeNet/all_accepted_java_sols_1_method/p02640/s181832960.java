import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int a = 0;
    for (int p = 0; p <= X; p++){
      for (int q = X; 0 <= q; q--){
        if ((p*2 + q*4 == Y) && (p+q == X)) {
          a++;
          break;
        }
      }
    }
    if (a == 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}