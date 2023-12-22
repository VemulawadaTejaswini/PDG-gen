import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int right =0, left =0;
    for (int i=0; i<M; i++) {
      int A = sc.nextInt();
      if (A < X ) left++;
      if (A > X ) right++;
    }
    System.out.println(Math.min(right,left)); 
  }
}