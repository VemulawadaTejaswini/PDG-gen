import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int[] val = new int[N];
    for(int i = 0; i < M; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      val[a-1]++;
      val[b-1]++;
    }
    for(int i = 0; i < N; i++){
      System.out.println(val[i]);
    }
  }
}