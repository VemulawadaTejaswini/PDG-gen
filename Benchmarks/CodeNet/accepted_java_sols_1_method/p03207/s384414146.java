import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < n; i++){
      int p = sc.nextInt();
      max = Math.max(p, max);
      sum += p;
    }

    System.out.println(sum - max/2);
  }
}