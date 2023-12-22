import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextLong();
    }
    long total = 0l;
    long now = 0l;
    for(int i = 0;i<n;i++){
      if(now <= a[i]){
        now = a[i];
      }else{
        total += now - a[i];
      }
    }
    System.out.println(total);
  }
}
