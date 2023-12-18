import java.util.*;
public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long t = sc.nextLong();

    long total = 0;
    long prev = sc.nextLong();

    long cur = 0;
    for(int i = 1; i < n; i++){
      cur = sc.nextLong();
      total += Math.min(t, cur - prev);
      prev = cur;
    }
    System.out.println(total + t);
  }
}
