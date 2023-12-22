import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int [] a = new int[n];
    for (int i=0; i<n-1;i++){
      int g =scan.nextInt();
      a[g-1] += 1;
    }

    for (int m=0; m<n; m++){
      System.out.println(a[m]);
    }
  }
}
