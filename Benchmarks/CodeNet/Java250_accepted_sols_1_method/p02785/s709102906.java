import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    long h[]=new long[n];
    for (int i=0;i<n;i++) {
      h[i]=sc.nextInt();
    }

    Arrays.sort(h);

    if (n<=k) {
      System.out.println(0);
    }else{
      long total=0;
      for (int i=0;i<n-k;i++) {
        total=total+h[i];
      }
      System.out.println(total);
    }
  }
}
