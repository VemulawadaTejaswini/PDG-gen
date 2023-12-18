import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] kazu = new long[n];
    long ans = 1l;
    for(int i = 0;i<n;i++){
      kazu[i] = sc.nextLong();
    }
    Arrays.sort(kazu);
    if(kazu[0] == 0l){
      System.out.println("0");
      return;
    }
    for(int i = 1;i<=n;i++){
      ans *= kazu[i];
      if(ans > 1000000000000000000l){
        System.out.println("-1");
        return;
      }
    }

    if(ans > 1000000000000000000l){
      System.out.println("-1");
      return;
    }
    if(ans < 0l){
      System.out.println("-1");
      return;
    }
    System.out.println(ans);
  }
}
