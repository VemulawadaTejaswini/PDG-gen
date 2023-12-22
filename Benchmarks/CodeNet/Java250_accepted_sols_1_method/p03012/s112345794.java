import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] s = sc.nextLine().split(" ");
    int[] val = new int[N];
    int sum = 0;
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(s[i]);
      sum += val[i];
    }
    
    int ans = 100000;
    int sum2 = 0;
    for(int i = 0; i < N; i++){
      sum2 += val[i];
      sum -= val[i];
      int a = Math.abs(sum - sum2);
      if(a < ans){
        ans = a;
      }
    }
    System.out.println(ans);
  }
}