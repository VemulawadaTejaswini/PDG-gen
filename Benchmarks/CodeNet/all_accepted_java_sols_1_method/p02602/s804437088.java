import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    long[] a = new long[n];

    for (int i=0;i<n;i++){
      a[i] = scan.nextLong();
    }

    for (int m=0;m<n-k;m++){
      long c = a[m];
      long d = a[k+m];
      if (d>c){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }
}
