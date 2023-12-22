import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long h = sc.nextLong();
    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;
    String ans = "Yes";
    
    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
      sum += a[i];
    }

    if(sum < h){
      ans = "No";
    }

    System.out.println(ans);
  }
}