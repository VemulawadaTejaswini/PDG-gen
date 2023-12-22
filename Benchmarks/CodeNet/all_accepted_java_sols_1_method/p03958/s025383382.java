import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int K = Integer.parseInt(sc.next());
    int T = Integer.parseInt(sc.next());
    int max = 0;
    for(int i = 0; i < T; i++){
      int n = Integer.parseInt(sc.next());
      max = max < n ? n : max;
    }
    
    System.out.println(Math.max(0,max*2-K-1));
  }
}