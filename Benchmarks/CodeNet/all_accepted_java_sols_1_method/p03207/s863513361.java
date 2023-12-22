import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    int sum = 0;
    int max = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      sum += n;
      max = max < n ? n : max;
    }
    
    sum -= max/2;
    System.out.println(sum);
  }
}