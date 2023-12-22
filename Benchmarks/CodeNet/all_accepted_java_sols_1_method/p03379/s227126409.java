import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
    }
    int[] a = Arrays.copyOf(x, x.length);
    Arrays.sort(x);
    int mid1 = x[n/2 - 1];
    int mid2 = x[n/2];
    for(int i = 0; i < n; i++){
      System.out.println(a[i] <= mid1 ? mid2 :mid1);
    }
  }
}