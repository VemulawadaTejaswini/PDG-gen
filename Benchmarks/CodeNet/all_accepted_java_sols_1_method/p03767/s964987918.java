import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] val = new int[N*3];
    for(int i = 0; i < N*3; i++){
      val[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(val);
    
    long ans = 0;
    for(int i = N; i < N*3; i+=2){
      ans += val[i];
    }
    System.out.println(ans);
  }
}