import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n+1];
    for(int i = 0; i < n; i++){
      int tmp = sc.nextInt();
      a[tmp]++;
    }
    Arrays.sort(a);
    int count = 0;
    for(int i = 0; i <= a.length - 1 - k; i++){
      count += a[i];
    }
    
    System.out.println(count);
  }
}