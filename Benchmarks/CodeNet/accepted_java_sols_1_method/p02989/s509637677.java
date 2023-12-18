import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
    
    for(int i = 0 ; i < N ; i ++){
      array[i] = sc.nextInt();
    }
    
    Arrays.sort(array);
    
    int ans = array[N/2] -array[N/2 -1];
    
    System.out.println(ans);
  }
}