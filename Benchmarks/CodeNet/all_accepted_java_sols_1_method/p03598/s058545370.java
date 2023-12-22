import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();    
    int K = sc.nextInt();
    int sum = 0;
    
    for(int i=0; i<N; i++) {
      int x = sc.nextInt();
      if(x <= Math.abs(K-x)) {
        sum = sum + x;
      } else {
        sum = sum + Math.abs(K-x);
      }
    }
    System.out.println(sum * 2);
  }
}
