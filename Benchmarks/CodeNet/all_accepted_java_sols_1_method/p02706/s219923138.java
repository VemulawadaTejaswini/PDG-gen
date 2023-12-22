import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long m = sc.nextLong();
    long sum = 0;

    for(int i = 0; i < m; i++){
      long a = sc.nextLong();
      sum += a;
    }

    if(sum > n){
      System.out.println("-1");
    } else {
      System.out.println(n - sum);
    }
  }
}
