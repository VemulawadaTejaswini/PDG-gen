import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i = 1; i <= 100000; i++){
      int x = (int)(i * 0.08);
      int y = (int)(i * 0.1);
      if(x == A && y == B){
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}