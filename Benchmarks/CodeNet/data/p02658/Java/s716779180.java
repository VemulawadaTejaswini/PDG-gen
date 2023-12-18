import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = 1;
    for (int i = 0; i < N; i++){
      long k = sc.nextLong();
      ans *= k;
    }
    if (Math.log10(ans) <= 18){
      System.out.println(ans);
    }else{
      System.out.println(-1);
    }
  }
}