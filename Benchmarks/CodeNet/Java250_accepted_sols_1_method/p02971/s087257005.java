import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] b = new int[n];
    int[] c = new int[n];
    for (int i=0 ;i<n; i++){
      int t = scan.nextInt();
      b[i] = t;
      c[i] = t;
    }

    Arrays.sort(c);
    if (n == 1){
      System.out.println(c[0]);
      return;
    }
    for (int j=0;j<n;j++){
      if (b[j] != c[n-1]){
        System.out.println(c[n-1]);
      }
      else{
        System.out.println(c[n-2]);
      }
    }
  }
}
