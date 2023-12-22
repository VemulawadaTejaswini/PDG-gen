import java.util.*;

public class  Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    
    List<Integer> h = new ArrayList<>();
    for(int i=0; i<N; i++){
      h.add(sc.nextInt());
    }
    
    Collections.sort(h);
    
    int ans = Integer.MAX_VALUE;
    for(int i=K-1; i<N; i++){
      int temp = h.get(i) - h.get(i - (K - 1));
      if(temp < ans){
        ans = temp;
      }
    }
    
    System.out.println(ans);
  }
}
    