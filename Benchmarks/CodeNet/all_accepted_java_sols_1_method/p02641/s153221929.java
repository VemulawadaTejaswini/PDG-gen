import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int N = sc.nextInt();
    HashSet<Integer> set = new HashSet<Integer>();
    
    for(int i=0; i<N; i++){
      set.add(sc.nextInt());
    }
    
    int ans = X;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i<=200; i++){
      if(set.contains(i)){
        continue;
      }
      int gap = Math.abs(X - i);
      if(gap < min){
        ans = i;
        min = gap;
      }
    }
    System.out.println(ans);
  }
}
 