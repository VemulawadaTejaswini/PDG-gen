import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a[] = new int[n];
    int min = -1;
    int max = -1;
    for (int i=0; i<n;i++){
      int b = scan.nextInt();
      a[i] = b;
      if (b<min){
        min = b;
      }
      if (b>max){
        max = b;
      }
    }

    int dis = max-min+1;

    int[] c = new int[dis];
    for (int i = min; i<=max; i++){
      int sum = 0;
      for (int j=0;j<n;j++){
        sum += (a[j] - i)*(a[j] - i);
      }
      c[i-min] = sum;
    }

    int minn = c[0];
    for (int gg=0; gg <max-min+1; gg++){
      if (c[gg] < minn){
        minn = c[gg];
      }
    }

    System.out.println(minn);

  }
}
